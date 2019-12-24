package com.hcl.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.dto.Customer;
import com.hcl.ing.service.CustomerService;



@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value ="/Customer" , method=RequestMethod.POST)
	public String addCustomer(Customer customer) {
		CustomerService.addCustomer(customer);
		return "Customer data added successfully";
		
	}

}
