package com.frontendDAOimpl;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frontendDAO.CategoryDAO;
import com.frontendModel.Category;

@Repository("CategoryDAO")
public class CategoryDAOimpl implements CategoryDAO {
@Autowired

SessionFactory sessionFactory;

public CategoryDAOimpl (SessionFactory sessionFactory) //constructor
{
	this.sessionFactory=sessionFactory;
}



/*@Transactional
	public boolean update(Category category) {
	
	try {
		
		sessionFactory.getCurrentSession().update(category);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		System.out.println("update catch");
		e.printStackTrace();
		return false;
		
	}
		
		
	}*/
/*@Transactional
	public boolean delete(Category category) {
		
		try {
			
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}*/
@Transactional
public Category get(String id) {
	return (Category)sessionFactory.openSession().get(Category.class,id);
	
}


	
	
	@Transactional
	public List<Category> list() {
		String hql="from Category";
		Query query= (Query) sessionFactory.openSession().createQuery(hql);
		
		return query.list();
	}
@Transactional
	public boolean delete(String id) {
		try {
			Category categoryToDelete = new Category();
			categoryToDelete.setCategory_id(id);;
			Session session = sessionFactory.openSession();
			session.delete(categoryToDelete);
			session.flush();
			
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
			return false;
		}
	}
@Transactional
public boolean saveorUpdate(Category category) {
	
	try {
		System.out.println("inside save or update");
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(category); 
		session.flush();
				
		return true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
	
		e.printStackTrace();
		return false;
	}
}



public Category getByName(String category_name) {
	String hql = "from Category where category_name='" + category_name + "'";
	
	
	Session session = sessionFactory.openSession();
	Query query = session.createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Category> listCategory = (List<Category>) query.list();

	if (listCategory != null && !listCategory.isEmpty()) {
	
		return listCategory.get(0);
	}

	return null;
}




	

	

	
}

