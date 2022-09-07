package com.java.demo.inventory;
import java.util.Arrays;
public class IproductServiceImpl implements IproductServices {

	
	static InventoryProduct []inventoryProducts = new InventoryProduct[0]; //0
	static int indexValue = 0;
	@Override
	public InventoryProduct addProduct(InventoryProduct iproduct) {
		if(iproduct!=null) {
			inventoryProducts = Arrays.copyOf(inventoryProducts, inventoryProducts.length+1);
			inventoryProducts[indexValue++] = iproduct;
			System.out.println("Product Successfully added...");
			return iproduct;
		}
		System.out.println("Invalid Product so cannot be added..!");
		return null;
	}
	@Override
	public boolean deleteProduct(int prodId) {
		if(inventoryProducts.length==0) {
			System.out.println("No Product for delete..!");
			return false;
		}
		InventoryProduct []products = new InventoryProduct[inventoryProducts.length-1];
		int index = 0;
		for (int i=0;i<inventoryProducts.length;i++) {
			InventoryProduct invProduct = inventoryProducts[i];
			if(invProduct.getIproductId() == prodId) {
				System.out.println("Product Successfully Deleted..!");
				continue;
			}
			products[index++] = invProduct;
		}
		inventoryProducts = products;
		return true;
	}
	@Override
	public InventoryProduct updateProduct(int prodId, InventoryProduct newValues) {
		
		for (int i = 0; i < inventoryProducts.length; i++) {
			
			InventoryProduct prod = inventoryProducts[i];
			if(prod.getIproductId()==prodId) {
				prod.setIproductBarcode(newValues.getIproductBarcode());
				prod.setIproductName(newValues.getIproductName());
				prod.setIproductPrice(newValues.getIproductPrice());
				prod.setIproductQty(newValues.getIproductQty());
				
				System.out.println("Product Successfully Updated..!");
				return prod;
				
			}
		}
		System.out.println("Given Product Id not so cannot update...!");
		return null;
	}
	@Override
	public InventoryProduct searchProductId(int prodId) {
		for (InventoryProduct iproduct : inventoryProducts) {
			if(iproduct.getIproductId() == prodId) {
				return iproduct;
			}
		}
		return null;
	}
	@Override
	public InventoryProduct[] listProducts() {
		return inventoryProducts;
	}
	@Override
	public InventoryProduct getMinPriceProduct() {
		double minPrice = 0.0;
		InventoryProduct tempProduct1=inventoryProducts[0];
		for (InventoryProduct iproduct1 : inventoryProducts) {
			if(iproduct1.getIproductPrice()<minPrice) {
				minPrice = iproduct1.getIproductPrice();
				tempProduct1 = iproduct1;
			}
		}
		return tempProduct1;
	}
	
	@Override
	public InventoryProduct[] searchByName(String name) {
		InventoryProduct tempProducts[] = new InventoryProduct[0];
		int index = 0;
		for (InventoryProduct iproduct : inventoryProducts) {
			if(iproduct.getIproductName().equals(name)) {
				tempProducts = Arrays.copyOf(tempProducts, tempProducts.length+1);
				tempProducts[index++] = iproduct;
			}
		}
		if(tempProducts.length == 0) {
			System.out.println("No Products Found..!");
		}
		return tempProducts;
	}
	@Override
	public InventoryProduct getMaxPriceProduct() {
		double maxPrice = 0.0;
		InventoryProduct tempProduct = null;
		for (InventoryProduct iproduct : inventoryProducts) {
			if(iproduct.getIproductPrice()>maxPrice) {
				maxPrice = iproduct.getIproductPrice();
				tempProduct = iproduct;
			}
		}
		return tempProduct;
	}
	
}
