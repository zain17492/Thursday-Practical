package com.Hibernate_OneToOne_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_OneToOne {

	public static void main(String[] args) 
	{
		System.out.println("Project has Started");
		
		//creating configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
        // building the session factory on the configuration
        SessionFactory fac=cfg.buildSessionFactory();
        
        //creating department objects
        Department d1=new Department();
        d1.setDid(201);
        d1.setDname("Sales");
        
        Department d2=new Department();
        d2.setDid(202);
        d2.setDname("Finance");
        
        Department d3=new Department();
        d3.setDid(203);
        d3.setDname("HR");
        
        //creating Employee objects
        Employee e1=new Employee();
        e1.setEid(101);
        e1.setEname("Komal");
        e1.setDept(d2);
        
        Employee e2=new Employee();
        e2.setEid(102);
        e2.setEname("Raj");
        e2.setDept(d3);
        
        
        
        Employee e3=new Employee();
        e3.setEid(203);
        e3.setEname("Aman");
        e3.setDept(d1);
        
        Session s=fac.openSession();
        Transaction tra=s.beginTransaction();
         s.save(e1);
         s.save(e2);
         s.save(e3);
         s.save(d1);
         s.save(d2);
         s.save(d3);
         
         tra.commit();
         s.close();
         fac.close();

}
		
	}


