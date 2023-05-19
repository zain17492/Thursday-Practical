package com.Spring_Demo.Springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // informing the application context about our configuration file
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	//we are asking teh context to get the object 
    	Student std1=(Student)context.getBean("s1");
    	
    	// printing the object    	
    	System.out.println(std1); 
    	
        Project pro1=(Project)context.getBean("p1");
    	
    	// printing the object    	
    	System.out.println(pro1); 
    	
        Employee emp1=(Employee)context.getBean("e1");
    	
    	// printing the object    	
    	System.out.println(emp1); 
    	
    }
}
