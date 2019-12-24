package com.hcl.ing.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.ing.dao.CustomerDAO;
import com.hcl.ing.dto.Customer;
import com.hcl.ing.dto.Transaction;



public class FundTransactionServiceImpl implements FundTransactionService {


	@Autowired	
	CustomerDAO customerDAO;

		//@Override
		public String addFundTransaction(Transaction transaction) {
			CustomerDAO.addFundTransaction(transaction);
			return "FundTransaction  added successfully";
		}


}
