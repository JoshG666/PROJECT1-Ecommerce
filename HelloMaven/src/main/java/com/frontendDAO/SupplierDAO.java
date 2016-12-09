package com.frontendDAO;



import java.util.List;

import com.frontendModel.Supplier;



public interface SupplierDAO {

	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public boolean saveOrUpdate(Supplier supplier);

	public boolean delete(String supplier_id);

	public Supplier get(String supplier_id);

	public Supplier getByName(String supplier_name);

	public List<Supplier> list();

}



