package com.eclature;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.eclature.model.Set_sites;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    /*	EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	em.getTransaction().commit();*/
    	

    	Configuration configure = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory = configure.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Set_sites s = new Set_sites(1, "somesh", "1", "Y"); 
    	session.save(s);
    	
    	transaction.commit();
    }
}
