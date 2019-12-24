package com.hcl.ing.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.ing.dao.CustomerDAO;
import com.hcl.ing.dto.Customer;



public class CustomerServiceImpl implements CustomerService {
	
	@Autowired	
	CustomerDAO customerDAO;

		//@Override
		public String addCustomer(Customer customer) {
			CustomerDAO.addCustomer(customer);
			return "customer added successfully";
		}

}
