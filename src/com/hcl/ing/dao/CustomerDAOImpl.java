package com.hcl.ing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.ing.dto.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
public SessionFactory SessionFactory;
	
	public SessionFactory getSessionFactory() {
		return SessionFactory;
	}

public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactory = sessionFactory;
	}

	public String addCustomer(Customer customer) {
		Session session=this.SessionFactory.getCurrentSession();
		session.save(customer);
		return "Customer Added Successfully";
		
	}

}
