package com.frontendDAOimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frontendDAO.BillingDAO;
import com.frontendModel.Billing;

@Repository("BillingDAO")
public class BillingDAOimpl implements BillingDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean save(Billing billing) {

		try {
			
			Session session = sessionFactory.openSession();
			
			session.save(billing);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	}


