package com.springtraining.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springtraining.service.AddressService;

import com.springtraining.VO.AddressVO;


@RestController
public class AddressSpringController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value = "/nirali" , method = RequestMethod.GET)
	public String print() {
		System.out.println("........");
		return "nirali";
	}
	
	@RequestMapping(value = "/addresses/{zipcode}")
	public List<AddressVO> getAddressByZipcode(@PathVariable int zipcode,HttpServletRequest request) {
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		/*int zip = Integer.parseInt(request.getParameter("zipcode"));
		add.setZipcode(zip);*/
		AddressVO add = new AddressVO();
		List<AddressVO> list = new ArrayList<AddressVO>();
		list = addressService.searchByZipcode(zipcode);
		
		return list;
		
		
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "login";
	} 
	
}
