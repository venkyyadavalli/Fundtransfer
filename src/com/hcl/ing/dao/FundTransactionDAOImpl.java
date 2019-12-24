package com.hcl.ing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.ing.dto.Transaction;
@Repository
public class FundTransactionDAOImpl implements FundTransactionDAO {
	
	@Autowired
	public SessionFactory SessionFactory;
		
		public SessionFactory getSessionFactory() {
			return SessionFactory;
		}

	public void setSessionFactory(SessionFactory sessionFactory) {
			SessionFactory = sessionFactory;
		}

	@Override
	public String addFundTransaction(Transaction transaction) {
		Session session=this.SessionFactory.getCurrentSession();
		session.save(transaction);
		return "Transaction Added Successfully";
	}

}
