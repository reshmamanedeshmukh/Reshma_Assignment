package com.java.demo.inventory;

public interface IproductServices {
	 public InventoryProduct addProduct(InventoryProduct iproduct);
	 public boolean deleteProduct(int prodId);
	 public InventoryProduct updateProduct(int prodId,InventoryProduct newValues);
	 public InventoryProduct searchProductId(int prodId);
	 public InventoryProduct[] listProducts();
	 public InventoryProduct getMinPriceProduct();
	 public InventoryProduct[] searchByName(String name);
	 public InventoryProduct getMaxPriceProduct();
}
