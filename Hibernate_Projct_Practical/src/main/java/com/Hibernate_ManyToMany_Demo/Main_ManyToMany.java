package com.Hibernate_ManyToMany_Demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main_ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				
				//creating configuration object
				 Configuration cfg=new Configuration();
			        cfg.configure("hibernate.cfg.xml");
			        // building the session factory on the configuration
			        SessionFactory factory=cfg.buildSessionFactory();
			        
			        Employee e1=new Employee();
			        e1.setEid(501);
			        e1.setEname("Zainab");
			        
			        Employee e2=new Employee();
			        e2.setEid(502);
			        e2.setEname("Vaibhavi");
			        
			        Employee e3=new Employee();
			        e3.setEid(503);
			        e3.setEname("Sameera");
			        
			        Project p1=new Project();
			        p1.setPid(101);
			        p1.setPname("Hotel mgmt System");
			        
			        Project p2=new Project();
			        p2.setPid(102);
			        p2.setPname("Library Mgmt System");
			        
			        Project p3=new Project();
			        p3.setPid(103);
			        p3.setPname("Placement mgmt System");
			        
			        //list of project
			        List<Project> pl1=new ArrayList<Project>();
			        pl1.add(p1);
			        pl1.add(p2);
			        
			        List<Project> pl2=new ArrayList<Project>();
			        pl2.add(p2);
			        pl2.add(p3);
			        
			        List<Employee> el1=new ArrayList<Employee>();
			        el1.add(e1);
			        el1.add(e2);
			        el1.add(e3);
			        
			        List<Employee> el2=new ArrayList<Employee>();
			        el2.add(e2);
			        el2.add(e3);
			        
			        //associating the project list with employee
			        e1.setProj(pl1);
			        e2.setProj(pl2);
			        e3.setProj(pl2);
			        
			        
			        
			        p2.setEmp(el1);
			        p3.setEmp(el2);
			        
			        Session s=factory.openSession();
			        Transaction tx=s.beginTransaction();
			        
			        s.save(e1);
			        s.save(e2);
			        s.save(e3);
			        s.save(p1);
			        s.save(p2);
			        s.save(p3);
			       
			        tx.commit();
			        
			        s.close();
			        factory.close();
			      
			}

		

	}


