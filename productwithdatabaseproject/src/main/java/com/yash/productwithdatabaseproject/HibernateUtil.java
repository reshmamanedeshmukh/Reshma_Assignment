package com.yash.productwithdatabaseproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	
	static SessionFactory sessionfactory = null;
	
	
	public static SessionFactory getSessionFactory() { // SingletoneApproach
		if(sessionfactory==null) {
			Configuration configure = new Configuration().configure();
			sessionfactory = configure.buildSessionFactory();
		}
		return sessionfactory;
	}
	
	
	public static void main(String[] args) {
		SessionFactory sfactory = getSessionFactory();
	
		
		
	}


	public static void cleanUp(Session session, Transaction tr) {
		if(session!=null) {
			if(tr!=null) {
				session.flush();
				tr.commit();
			}
			session.close();
		}
		
	}

}
