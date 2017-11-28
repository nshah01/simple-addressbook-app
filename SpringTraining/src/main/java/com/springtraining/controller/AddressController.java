package com.springtraining.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springtraining.VO.AddressVO;
import com.springtraining.service.AddressMVCService;

@RestController
public class AddressController {	
	
	@Autowired
	AddressMVCService addService;
	
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		System.out.println("Welcome");
		return new ModelAndView("welcome");
		
	}
	
	@RequestMapping("/index")
		public ModelAndView searchForm() {
		System.out.println("FOrm");
		return new ModelAndView("index");
	}
	
	@RequestMapping("/addresses")
	public ModelAndView getAddressesByZip(HttpServletRequest request,@ModelAttribute AddressVO add) {
		
		int zip = Integer.parseInt(request.getParameter("zipcode"));
		add.setZipcode(zip);
		List list = new ArrayList<>();
		list = addService.search(add);
		System.out.println(list);
		return new ModelAndView("displayAddress").addObject("list", list);
		
	}
	
	public void insertJunk(AddressVO address) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();
		try {
			addService = new AddressMVCService();
			
			 list =addService.getAddressLine1(address); 
			String line1 = list.get(0).toString();
			System.out.println(">>>>>>>>> In Insert Junk<<<<<<<<<<"+line1);
			address.setLine1(line1);
			
			list2 = addService.getAddressLine2(address);
			String line2 = list2.get(0).toString();
			System.out.println(">>>>>>>>>>>>>>>>>In Insert Junk<<<<<<<<"+line2);
			address.setLine2(line2);
			
			list3 = addService.getZipcode(address);
			int zipcode = list3.get(0).intValue();
			System.out.println(">>>>>>>>>>>>>>>>>"+zipcode);
			address.setZipcode(zipcode);
			
			list4 =addService.getfirst(address);
			String firstname = list4.get(0).toString();
			System.out.println(">>>>>>>>> In Insert Junk<<<<<<<<<<"+firstname);
			address.setFirstname(firstname);
			
			list5 = addService.getlast(address);
			String lastname = list5.get(0).toString();
			System.out.println(">>>>>>>>>>>>>>>>>In Insert Junk<<<<<<<<"+lastname);
			address.setLastname(lastname);
			
			addService.insert(address);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertName(AddressVO address) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<Integer> list3 = new ArrayList<Integer>();
		try {
			addService = new AddressMVCService();
			 list =addService.getfirst(address);
			 String firstname = list.get(0).toString();
			System.out.println(">>>>>>>>> In Insert Junk<<<<<<<<<<"+firstname);
			address.setFirstname(firstname);
			list2 = addService.getlast(address);
			String lastname = list2.get(0).toString();
			System.out.println(">>>>>>>>>>>>>>>>>In Insert Junk<<<<<<<<"+lastname);
			/*ddress.setLastname(lastname);
			list3 = addService.getZipcode(address);
			int zipcode = list3.get(0).intValue();
			System.out.println(">>>>>>>>>>>>>>>>>"+zipcode);
			address.setZipcode(zipcode);*/
			
			addService.insert(address);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
