package com.yash.productwithdatabaseproject;

import java.util.List;

public interface ProductService {
	public Product addProduct(Product prod);
	public Product updateProduct(int prodId,Product prod);
	public Product searchById(int prodid);
	public List<Product> getListOfProducts();
	public void deleteProduct(int prodId);
	public Product getMaxPriceProduct();
	public Product getMinPriceProduct();
	
}
