package com.frontendDAOimpl;

import java.io.IOException;

import org.hibernate.HibernateException;
//import com.niit.service.OrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frontendDAO.CartDAO;
import com.frontendModel.Cart;

@Repository
@Transactional
public class CartDAOimpl implements CartDAO{

    @Autowired
    private SessionFactory sessionFactory;

   /* @Autowired
    private OrderService orderService;*/

    public Cart getCartById (int cartId) {
        Session session = sessionFactory.openSession();
        
        return (Cart) session.get(Cart.class, cartId);
    }

    public void update(Cart cart) {
		
		Session session = sessionFactory.openSession();
		try {
			cart.setGrandTotal(3.33);
			session.update(cart);
			session.flush();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

 public Cart validate(int cartId) throws IOException {
        Cart cart=getCartById(cartId);
        if(cart==null||cart.getCartItems().size()==0) {
            throw new IOException(cartId+"");
        }
        update(cart);
        return cart;
    }
 }

