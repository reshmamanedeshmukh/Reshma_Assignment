package com.java.demo.inventory;

public class InventoryProduct {
	private int iproductId;
	private String iproductName;
	private int iproductQty;
	private double iproductPrice;
	private String iproductBarcode;
	static private String productVendor = "Samsung";
	public int getIproductId() {
		return iproductId;
	}
	public void setIproductId(int iproductId) {
		if(iproductId<=0) {
			System.out.println("Invalid product id...");
			return;
			
		}
		
		this.iproductId = iproductId;
	}
	public String getIproductName() {
		return iproductName;
	}
	public void setIproductName(String iproductName) {
		this.iproductName = iproductName;
	}
	public int getIproductQty() {
		return iproductQty;
	}
	public void setIproductQty(int iproductQty) {
		this.iproductQty = iproductQty;
	}
	public double getIproductPrice() {
		return iproductPrice;
	}
	public void setIproductPrice(double iproductPrice) {
		this.iproductPrice = iproductPrice;
	}
	public String getIproductBarcode() {
		return iproductBarcode;
	}
	public void setIproductBarcode(String iproductBarcode) {
		this.iproductBarcode = iproductBarcode;
	}
	@Override
	public String toString() {
		return "InventoryProduct [iproductId=" + iproductId + ", iproductName=" + iproductName + ", iproductQty="
				+ iproductQty + ", iproductPrice=" + iproductPrice + ", iproductBarcode=" + iproductBarcode + "]";
	}
	public InventoryProduct(int iproductId, String iproductName, int iproductQty, double iproductPrice,
			String iproductBarcode) {
		super();
		//this.iproductId = iproductId;
		this.setIproductId(iproductId);
		this.iproductName = iproductName;
		this.iproductQty = iproductQty;
		this.iproductPrice = iproductPrice;
		this.iproductBarcode = iproductBarcode;
	}
	
	
	
}
