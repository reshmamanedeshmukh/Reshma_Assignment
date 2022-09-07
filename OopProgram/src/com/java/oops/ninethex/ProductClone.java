package com.java.oops.ninethex;

class Product1 implements Cloneable{
	private String pid;
	private String pname;
	private String unitofmeasure;
	private int price;
	
protected Product1 clone() throws CloneNotSupportedException {
		
		return (Product1) super.clone();
	}

public String getPid() {
	return pid;
}

public void setPid(String pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getUnitofmeasure() {
	return unitofmeasure;
}

public void setUnitofmeasure(String unitofmeasure) {
	this.unitofmeasure = unitofmeasure;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Product1(String pid, String pname, String unitofmeasure, int price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.unitofmeasure = unitofmeasure;
	this.price = price;
}

@Override
public String toString() {
	return "Product1 [pid=" + pid + ", pname=" + pname + ", unitofmeasure=" + unitofmeasure + ", price=" + price + "]";
}
	
}
public class ProductClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		 
		 
		 
        
        Product1 pro1=new Product1("101", "suger", "Kg", 50);
        
        Product1 pro2=(Product1) pro1.clone();
        System.out.println(pro2);
       
        
        pro2.setPname("tea");
        pro2.setPid("102");
        
        System.out.println(pro2);
        
        if(pro2 instanceof Product1) {
            
            System.out.println("Objects are same");

}
 }

}
