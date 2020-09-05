package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
	
	@RequestMapping(value = "/userLogout", method = RequestMethod.GET)
	protected ModelAndView logoutUser(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session=request.getSession();  //getting session object
		
		session.getAttribute("userEmail");
		session.removeAttribute("userEmail");  //removing session for user
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		
		return mv;
	}
	
	@RequestMapping(value = "/adminLogout", method = RequestMethod.GET)
	protected ModelAndView logoutAdmin(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session=request.getSession();  //getting session object
		
		session.getAttribute("adminEmail");
		session.removeAttribute("adminEmail");  //removing session for Admin
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		
		return mv;
	}

}
