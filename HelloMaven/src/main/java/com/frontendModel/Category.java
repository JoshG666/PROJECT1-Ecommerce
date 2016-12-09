package com.frontendModel;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.frontendModel.Product;
@Entity
@Component
@Repository("category")
public class Category implements Serializable{
	
	
	private static final long serialVersionUID = 3L;
	@Id 
private String category_id;
private String category_name;
private String category_description;

@OneToMany(mappedBy="category",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private Set<Product> products;


public Set<Product> getProducts() {
	return products;
}

public void setProducts(Set<Product> products) {
	this.products = products;
}

@Column(name="ID")
public String getCategory_id() {
	return category_id;
}
public void setCategory_id(String category_id) {
	this.category_id = category_id;
}
@Override
public String toString() {
	return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_description="
			+ category_description + "]";
}
public String getCategory_name() {
	return category_name;
}
public void setCategory_name(String category_name) {
	this.category_name = category_name;
}
public String getCategory_description() {
	return category_description;
}
public void setCategory_description(String category_description) {
	this.category_description = category_description;
}



}
