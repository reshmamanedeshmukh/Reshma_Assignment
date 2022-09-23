package com.yash.productwithdatabaseproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ProductServiceImpl {

	
	 SessionFactory sfactory = null;
	 
	  public ProductServiceImpl() { 
		  this.sfactory =HibernateUtil.getSessionFactory();
	  
	  }
	 
	

	
	 public Product addProduct(Product prod) {
	 
	 
	 Session session = null;
	 Transaction tr = null; 
	 try { session =
	  sfactory.openSession();
	 tr = session.beginTransaction(); 
	  Product dbProd =session.get(Product.class, prod.getProdId());
	  if(prod!= null) {
	 
	 session.save(prod); System.out.println("Product saved sucessfully");
	 return prod;
	  
	  } 
	  }catch(Exception e)
	 { System.out.println("Problem in add method..");
	  }finally { HibernateUtil.cleanUp(session,tr); }
	  
	  return null; }
	  
	  public Product updateProduct(int prodId, Product prod) {
		  Session session =null;
		  Transaction tr = null;
		  try { session = sfactory.openSession(); 
		  tr =session.beginTransaction(); 
		  Product dbprod = session.get(Product.class,prodId); 
		  if(dbprod!=null) { 
			  dbprod.setProdName(prod.getProdName());
	  dbprod.setProdPrice(prod.getProdPrice());
	  dbprod.setProdQty(prod.getProdQty());
	  dbprod.setProdVendor(prod.getProdVendor()); 
	  session.update(dbprod);
	  return dbprod; } }catch (Exception e) {
	  System.out.println("Problem in Update method.."); }
		  finally {
	  HibernateUtil.cleanUp(session,tr); } return null; }
	  
	  public Product searchById(int prodId) { Session session = null; 
	  Transaction tr = null;
	  try { session = sfactory.openSession(); //tr =
	  session.beginTransaction();
	  return session.get(Product.class, prodId); }
	  catch(Exception e) { System.out.println("Problem in search method.."); }finally {
	  HibernateUtil.cleanUp(session,tr); } return null; }
	 

	@SuppressWarnings({ "deprecation", "unused" })
	public  List<Product> getListOfProducts() {
		Session session = null;
		 Transaction tr = null;
	 Product prodc=null;
		 List<Product> plist=new ArrayList<>();

		try {
			 session = sfactory.openSession();
			 tr = session.beginTransaction();

			 CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Product> query = builder.createQuery(Product.class);
	         Root<Product> root = query.from(Product.class);
	         query.select(root);
	         Query<Product> q=session.createQuery(query);
	         List<Product> products=q.getResultList();

			
			return products;

		} catch (Exception e) {
			System.out.println("Problem in List method..");
		} finally {
			 HibernateUtil.cleanUp(session,tr);
		}
		return null;
	}

	
	  public void deleteProduct(int prodId) { Session session = null;
	  Transaction tr = null; 
	  
	  try { session = sfactory.openSession();
	  tr =session.beginTransaction();
	  Product dbProd = session.get(Product.class,prodId);
	  if(dbProd!=null) {
		  session.delete(dbProd);
	  System.out.println(" given product id deleted..");
	  	  } else{ 
	  		  System.out.println("product id not avliable to delete "); 
	  		  } 
	  }catch
	  (Exception e) { System.out.println("Problem in delete method.."); }finally {
	  HibernateUtil.cleanUp(session,tr); }
	  
	  }
	  
	  public Product getMaxPriceProduct() { Session session = null; Transaction tr
	  = null; try {
	  
	  List<Product> products = getListOfProducts(); double maxPrice = 0.0; Product
	  tempProduct = null; for (Product product : products) {
	 if(product.getProdPrice()>maxPrice) { tempProduct = product; maxPrice =
	  product.getProdPrice(); } }
	  System.out.println("here is the max Price --"+maxPrice); return tempProduct;
	  }catch (Exception e) { System.out.println("Problem in add method..");
	  }finally { HibernateUtil.cleanUp(session,tr); } return null; }
	
	public Product getMinPriceProduct() {
		Session session = null;
		Transaction tr = null;
		try {

			List<Product> products = getListOfProducts();
			Comparator<Product> prodSort = (p1, p2) -> (int) (p1.getProdPrice() - p2.getProdPrice());

			products.sort(prodSort);
			System.out.println("here is the max Price --" + products.get(0).getProdPrice());
			return products.get(0);

		} catch (Exception e) {
			System.out.println("Problem in add method..");
		} finally {
			HibernateUtil.cleanUp(session, tr);
		}
		return null;
	}

}
