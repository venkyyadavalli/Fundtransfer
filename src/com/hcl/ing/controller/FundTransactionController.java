package com.hcl.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.dto.Transaction;
import com.hcl.ing.service.FundTransactionService;
	
	

@RestController
@RequestMapping("/")
public class FundTransactionController {
	
	@Autowired
	FundTransactionService fundtransactionService;
	
	@RequestMapping(value ="/Customer" , method=RequestMethod.POST)
	public String addCustomer(Transaction transaction) {
		FundTransactionService.addFundTransaction(transaction);
		return "Customer data added successfully";
		
	}

}
