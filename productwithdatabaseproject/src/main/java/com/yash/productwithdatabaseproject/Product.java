package com.yash.productwithdatabaseproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_INFORMATION")
public class Product {
	
	@Id
	private int prodId;
	private String prodName;
	
	//9999.99
	@Column(name = "PRODUCT_PRICE",precision = 6,scale = 2)
	private double prodPrice;
	private int prodQty;
	
	@Column(length = 30,nullable = true,unique = false)
	private String prodVendor;
	
	
	public Product(int prodId, String prodName, double prodPrice, int prodQty, String prodVendor) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		this.prodVendor = prodVendor;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodQty="
				+ prodQty + ", prodVendor=" + prodVendor + "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	
	
	
	
}

