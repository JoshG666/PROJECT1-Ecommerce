package com.frontendModel;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.frontendModel.Category;
import com.frontendModel.Supplier;


@Entity
@Component
public class Product implements Serializable{
	
	
	private static final long serialVersionUID = 4L;

	@Id 
	private String product_id;
	private String product_name;
	private float product_price;
	private String product_description;
	
	
	@ManyToOne
    @JoinColumn(name="product_category_id", nullable = false, updatable = false, insertable = false)
   	private Category category;
	
	@ManyToOne
    @JoinColumn(name="product_supplier_id",nullable = false, updatable = false, insertable = false)
	private Supplier supplier;
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	public String getProduct_category_id() {
		return product_category_id;
	}
	public void setProduct_category_id(String product_category_id) {
		this.product_category_id = product_category_id;
	}
	public String getProduct_supplier_id() {
		return product_supplier_id;
	}
	public void setProduct_supplier_id(String product_supplier_id) {
		this.product_supplier_id = product_supplier_id;
	}
	public MultipartFile getItemImage() {
		return itemImage;
	}
	public void setItemImage(MultipartFile itemImage) {
		this.itemImage = itemImage;
	}
	private String product_category_id;
	private String product_supplier_id;
	@Transient
    private MultipartFile itemImage;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	
	

}