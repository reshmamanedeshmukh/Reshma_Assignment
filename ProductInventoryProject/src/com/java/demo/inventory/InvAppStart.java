package com.java.demo.inventory;
import java.util.Arrays;
import java.util.Scanner;

public class InvAppStart {
	

	public static void main(String[] args) {
		IproductServiceImpl service = new IproductServiceImpl(); // Object created to access instance method
		boolean flag = true;
		while(flag) {
			
			System.out.println("\n\n################################################################################");
			System.out.println(""
					+ "1. Add New Product \n"
					+ "2. Search Product By Name\n"
					+ "3. Search Product By Id\n"
					+ "4. Delete Product\n"
					+ "5. Update Product\n"
					+ "6. Get Min Price Product\n"
					+ "7. Get Max Price Product\n"
					+ "8. Get All Products\n"
					+ "\n");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-----------PRODUCT ADD OPERATION-------------");
				System.out.println("Enter Product Id : ");
				int prodId = sc.nextInt();
				System.out.println("Enter Product Name : ");
				String prodname = sc.next();
				System.out.println("Enter Product Price : ");
				double prodPrice = sc.nextDouble();
				System.out.println("Enter Product Qty : ");
				int prodqty = sc.nextInt();
				System.out.println("Enter Product Barcode : ");
				String barcode = sc.next();
				InventoryProduct iproduct = new InventoryProduct(prodId, prodname, prodqty,prodPrice, barcode);
				iproduct = service.addProduct(iproduct);
				System.out.println(iproduct);
				break;
			case 2:
				System.out.println("-----------PRODUCT SEARCH BY NAME OPERATION-------------");
				
				System.out.println("Enter Product Name : ");
				String name = sc.next();
				InventoryProduct prod[] = service.searchByName(name);
				System.out.println(Arrays.toString(prod));
				break;
			case 3:
				System.out.println("-----------PRODUCT SEARCH BY ID OPERATION-------------");
				System.out.println("Enter Product ID : ");
				int pid = sc.nextInt();
				InventoryProduct pr = service.searchProductId(pid);
				System.out.println(pr);
				break;
			case 4:
				System.out.println("-----------PRODUCT DELETE OPERATION-------------");
				System.out.println("Enter Product ID : ");
				int prid = sc.nextInt();
				boolean val = service.deleteProduct(prid);
				System.out.println(val);
				break;
			case 5:
				System.out.println("-----------PRODUCT UPDATE OPERATION-------------");
				System.out.println("Enter Product ID : ");
				int upid = sc.nextInt();
				System.out.println("Enter Product NAME : ");
				String uname = sc.next();
				System.out.println("Enter Product PRICE : ");
				double uprice = sc.nextDouble();
				System.out.println("Enter Product QTY : ");
				int uqty = sc.nextInt();
				System.out.println("Enter Product BARCODE : ");
				String ubar = sc.next();
				InventoryProduct uproduct = new InventoryProduct(upid, uname, uqty,uprice, ubar);
				iproduct = service.updateProduct(upid,uproduct);
				System.out.println(iproduct);
				break;
			case 6:
				System.out.println("-----------PRODUCT MIN PRICE OPERATION-------------");
				InventoryProduct minPriceProduct = service.getMinPriceProduct();
				System.out.println(minPriceProduct);
				break;
			case 7:
				System.out.println("-----------PRODUCT MAX PRICE OPERATION-------------");
				InventoryProduct maxPriceProduct = service.getMaxPriceProduct();
				System.out.println(maxPriceProduct);
				break;
			case 8:
				System.out.println("-----------PRODUCT SHOW ALL OPERATION-------------");
				System.out.println(Arrays.toString(service.listProducts()));
				break;
			default:
				System.out.println("Invalid Choice..!");
				break;
			}
			
			
			
		}
		
		
		
		
	}

}
