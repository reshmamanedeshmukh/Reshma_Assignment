package com.yash.productwithdatabaseproject;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App 
{
public static void main(String[] args) {
		
		
		ProductServiceImpl service = new ProductServiceImpl(); //getsessionfactory
		Product pro=new Product();
		
		boolean flag = true;
		while(flag) {
			
			System.out.println("\n\n################################################################################");
			System.out.println(""
					+ "1. Add New Product \n"
					
					+ "2. Search Product By Id\n"
					+ "3. Delete Product\n"
					+ "4. Update Product\n"
					+ "5. Get Min Price Product\n"
					+ "6. Get Max Price Product\n"
					+ "7. Get All Products\n"
					+ "\n");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-----------PRODUCT ADD OPERATION-------------");
				System.out.println("Enter Product Id : ");
				int prodId = sc.nextInt();
				
				  Product pr1 = service.searchById(prodId); if(pr1!=null) {
				  if(pr1.getProdId()==prodId ){
				  System.out.println("Product id is already present: "); break; }}
				 
				System.out.println("Enter Product Name : ");
				String prodname = sc.next();
				System.out.println("Enter Product Price : ");
				double prodPrice = sc.nextDouble();
				System.out.println("Enter Product Qty : ");
				int prodqty = sc.nextInt();
				System.out.println("Enter Product vender : ");
				String vendername = sc.next();
				Product addproduct = new Product(prodId, prodname, prodPrice,prodqty,vendername);
				Product addproduct1 = service.addProduct(addproduct);
				System.out.println(addproduct1);
					
				
				
				break;
			
			
			  case 2:
			  System.out.println("-----------PRODUCT SEARCH BY ID OPERATION-------------");
			  System.out.println("Enter Product ID : ");
			  int pid = sc.nextInt();
			  Product pr = service.searchById(pid);    
			 System.out.println(pr);
			  break; 
			  
			  
			  
	 case 3:
			  System.out.println("-----------PRODUCT DELETE OPERATION-------------");
			  System.out.println("Enter Product ID : "); 
			  int prid = sc.nextInt();
	           service.deleteProduct(prid); 
	             break; 
			  
	 
	 case 4:
			  System.out.println("-----------PRODUCT UPDATE OPERATION-------------");
			  System.out.println("Enter Product ID : "); 
			  int upid = sc.nextInt();
			 Product pr2 = service.searchById(upid);  
				if(pr2 ==null) {
					System.out.println("Product id is not present so can not update: ");   break;
					}
			  System.out.println("Enter Product NAME : ");
			  String uname = sc.next();
			  System.out.println("Enter Product PRICE : "); 
			  double uprice = sc.nextDouble(); 
			  System.out.println("Enter Product QTY : ");
			  int uqty =sc.nextInt(); 
			  System.out.println("Enter Product vender : "); 
			  String uven =sc.next();
			 Product uproduct = new Product(upid,uname,uprice,uqty,uven); 
			  Product product1 = service.updateProduct(upid, uproduct);
			  System.out.println(product1); break; 
			  
			  
	 case 5:
			  System.out.println("-----------PRODUCT MIN PRICE OPERATION-------------");
			  Product minPriceProduct = service.getMinPriceProduct();
			  System.out.println(minPriceProduct); break; 
			  
	  case 6:
			  System.out.println("-----------PRODUCT MAX PRICE OPERATION-------------");
			  Product maxPriceProduct = service.getMaxPriceProduct();
			 System.out.println(maxPriceProduct); break; 
			  
			  
	  case 7:
			  System.out.println("-----------PRODUCT SHOW ALL OPERATION-------------");
			  List<Product> products = service.getListOfProducts(); 
			  System.out.println(products);
			  
			  break;
			 
	default:
				System.out.println("Invalid Choice..!");
				break;
			}
			
			
			System.out.println("Do you want to continue yes/no");
		String ch=sc.next();
			if(ch.equals("no"))
			{
				flag= false;
			}
			
			
			
		}
		
		
	
		System.out.println("Completed...");
		
		
	}
}


