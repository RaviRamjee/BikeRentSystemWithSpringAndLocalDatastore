package com.spring.controller;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.spring.dao.UserImpl;
import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class UserController {

	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	protected ModelAndView regUser(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("phoneNo") String phoneNo,
			@RequestParam("address") String address,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		// getting datastore service
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		// getting object of ModelAndView
		ModelAndView mv = new ModelAndView();
		UserImpl uImpl = new UserImpl();
		UserService service = new UserService(); //getting userservice object

		String afterHashing = "";
		afterHashing = service.passwordHashing(password); // converting password into cryptographic form

		User user = new User();
		// user.setUserId(UUID.randomUUID().toString());
		user.setUserName(name);
		boolean validation = service.isValid(email);
		if(validation == false)
		{
			response.sendRedirect("Reg.jsp"); //redirecting to another page when validation is false
		}
		
		//setting user data by setter methods
		user.setUserEmail(email);
		user.setUserPassword(afterHashing);
		user.setUserPhoneNo(phoneNo);
		user.setUserAddress(address);

		String userEmail = "";
		int temp = 0;

		// Query object for fetching the data from datastore
		Query q = new Query("User");
		PreparedQuery pq = ds.prepare(q);
		for (Entity e : pq.asIterable()) {
			userEmail = e.getProperty("userEmail").toString();  //getting user Email from datastore
			System.out.println("userEmail========" + userEmail);

			//comparing user's input email with datastore email
			if (email.equals(userEmail)) {
				temp = 1;
			}
		}
		
		/**
		  -->if temp value is '1' means email is already available in the datastore
		  -->if temp not equal to '1' then will insert the user data in the datastore
		 */
		if (temp == 1) {
			mv.setViewName("Reg"); // setting view name
		} else {

			uImpl.insert(user);
			mv.setViewName("Login"); // setting view name
		}
		return mv; //return final view result
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	protected ModelAndView loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// getting datastore service
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		UserService service = new UserService();
		// getting object of ModelAndView
		ModelAndView mv = new ModelAndView();
		
		String myHash = "";
		myHash = service.passwordHashing(password); // converting password string into cryptography string for comparison
        
		// comparing email and password for admin  and redirect to the admin home page
		if(email.equals("ravirajgzp@gmail.com") && password.equals("12345"))
		{
			//creating session object and set attribute 
			HttpSession session = request.getSession();
			session.setAttribute("adminEmail", email);

			response.sendRedirect("AdminHomepage.jsp");
		}
		
		String userEmail = "";
		String userPassword = "";
		int temp = 0;
		// Query object for fetching the data from datastore
		Query q = new Query("User");
		PreparedQuery pq = ds.prepare(q);
		for (Entity e : pq.asIterable()) {
			userEmail = e.getProperty("userEmail").toString();
			userPassword = e.getProperty("userPassword").toString();
			/**
			 --> comparing user's input email and password with the datastore value.
			 -->if temp is '1' means email and password is matching
			 */
			if (email.equals(userEmail) && myHash.equals(userPassword)) {
				temp = 1;
			}
		}
		if (temp == 1) {
			//creating session object and set attribute 
			HttpSession session = request.getSession();
			session.setAttribute("userEmail", email);

			mv.setViewName("WelcomeHomepage");  //setting view if email and password is matching
			mv.addObject("email", email);
		} else {
			mv.setViewName("Login");  //sending to login page again if email and password not matches
		}

		return mv;
	}

}
