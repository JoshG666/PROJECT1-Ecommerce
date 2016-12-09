package com.frontendDAOimpl;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frontendDAO.SupplierDAO;
import com.frontendModel.Supplier;

@Repository("SupplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	//SAVE AND UPDATE METHODS NOT NEEDED...... REMOVE IT
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}
	
	public SupplierDAOImpl( ) {
	
	}
	
	
	@Transactional
	public Supplier getByName(String supplier_name) {


		String hql = "from Supplier where supplier_name='" + supplier_name + "'";

		Query query = sessionFactory.openSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) query.list();

		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}

		return null;
	}
	@Transactional
	public boolean save(Supplier supplier) {
		// TODO Auto-generated method stub

		try {
			sessionFactory.openSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean saveOrUpdate(Supplier supplier) {
		try {
			Session session = sessionFactory.openSession();
			session.saveOrUpdate(supplier); 
			session.flush();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Supplier supplier) {
		try {
			sessionFactory.openSession().update(supplier);
			sessionFactory.openSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(String supplier_id) {
		try {
			Supplier supplierToDelete = new Supplier();
			supplierToDelete.setSupplier_id(supplier_id);;
			Session session = sessionFactory.openSession();
			session.delete(supplierToDelete);
			session.flush();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Supplier get(String supplier_id) {


		String hql = "from Supplier where supplier_id='" + supplier_id + "'";

		Query query = sessionFactory.openSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) query.list();

		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}

		return null;
	}

	@Transactional
	public List<Supplier> list() {

		String hql = "from Supplier ORDER BY supplier_id ASC";
		Query query = sessionFactory.openSession().createQuery(hql);
		List<Supplier> list = query.list();
		if (list == null || list.isEmpty()) {
			System.out.println("No products available");
		}
		return list;
	}
}
