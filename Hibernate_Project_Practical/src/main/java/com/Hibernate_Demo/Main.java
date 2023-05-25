package com.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {



    public static void main( String[] args )
    {
       System.out.println("Project has Started");
       //Creating the configuration
       Configuration cg = new Configuration();
       cg.configure("hibernate.cfg.xml");
    // building the session factory on the configuration
       SessionFactory sf = cg.buildSessionFactory();
       
      
     //creating the object
       Student s1 = new Student();
       s1.setSid(101);
       s1.setSname("Zainab");
       s1.setSage(20);
       
       Session ss = sf.openSession();
       Transaction tr = ss.beginTransaction();
       ss.save(s1);
       tr.commit();
       ss.close();
       sf.close();
       
       
       
    }
}
