package com.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.BikeImpl;
import com.spring.model.Bike;
import com.spring.service.BikeService;

@Controller
public class BikeController {

	@RequestMapping(value = "/addBike", method = RequestMethod.POST)
	protected ModelAndView regUser(@RequestParam("bikeName") String bikeName,
			@RequestParam("bikeDescription") String bikeDescription, @RequestParam("bikeCategory") String bikeCategory,
			@RequestParam("bikeCompany") String bikeCompany, @RequestParam("bikeModel") String bikeModel,
			@RequestParam("bikeRCNo") String bikeRCNo, @RequestParam("bikeRCName") String bikeRCName,
			@RequestParam("bikeRCRegDate") String bikeRCRegDate, @RequestParam("bikeRCExpDate") String bikeRCExpDate,
			@RequestParam("bikeRCCHNO") String bikeRCCHNO, @RequestParam("bikeRCEnginNo") String bikeRCEnginNo,
			@RequestParam("bikeYearMfg") String bikeYearMfg,@RequestParam("bikeNoOfGear") int bikeNoOfGear,
			@RequestParam("bikeColor") String bikeColor,@RequestParam("selfstart") int selfstart,
			@RequestParam("bikeEnginCC") int bikeEnginCC,@RequestParam("status") int status,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//getting ModelAndView object
		ModelAndView mv = new ModelAndView();
		
		Bike bike = new Bike(); //getting Bike pojo object
		BikeService service = new BikeService(); //getting BikeService object for service logic 
		BikeImpl impl = new BikeImpl(); //getting BikeImpl object for datastore persistance
		
		/** bike = service.setterBike(bikeName,bikeDescription,bikeCategory,bikeCompany,bikeModel,bikeRCNo,
				bikeRCName,bikeRCRegDate,bikeRCExpDate,bikeRCCHNO,bikeRCEnginNo,bikeYearMfg,bikeNoOfGear,
				bikeColor,selfstart,bikeEnginCC,status); //calling setterBike method for setting the bike data through setter method
        */	
		
		    bike.setBikeName(bikeName);
	        bike.setBikeDescription(bikeDescription);
	        bike.setBikeCategory(bikeCategory);
	        bike.setBikeCompany(bikeCompany);
	        bike.setBikeModel(bikeModel);
	        bike.setBikeRCNo(bikeRCNo);
	        bike.setBikeRCName(bikeRCName);
	        bike.setBikeRCRegDate(bikeRCRegDate);
	        bike.setBikeRCExpDate(bikeRCExpDate);
	        bike.setBikeRCCHNO(bikeRCCHNO);
	        bike.setBikeRCEnginNo(bikeRCEnginNo);
	        bike.setBikeYearMfg(bikeYearMfg);
	        bike.setBikeNoOfGear(bikeNoOfGear);
	        bike.setBikeColor(bikeColor);
	        bike.setSelfstart(selfstart);
	        bike.setBikeEnginCC(bikeEnginCC);
	        bike.setStatus(status);
	        
		    impl.insert(bike); //calling insert method for insert the bike data in the datastore
	
	
		return mv;
	}

}
