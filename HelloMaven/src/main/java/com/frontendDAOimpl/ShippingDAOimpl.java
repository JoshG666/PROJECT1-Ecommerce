package com.frontendDAOimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frontendDAO.ShippingDAO;
import com.frontendModel.Shipping;

@Repository("ShippingDAO")
public class ShippingDAOimpl implements ShippingDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean save(Shipping shipping) {

		try {
			
			Session session = sessionFactory.openSession();
			
			session.save(shipping);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	}


