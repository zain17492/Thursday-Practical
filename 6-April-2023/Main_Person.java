
/*Write a program using constructor. create a class Person with Id, name,Designation.Ask
 * the user what are his input and according to that call the constructor*/
package Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Person // Class
{
	int id; //Data members
	String name;
	String designation;
	
	

	 Person(int id, String name) //Constructor
	{
		
		this.id =id;
		this.name= name;
	}
	

	 Person(String name, String designation) //Constructor
	{
		this.name = name;
		this.designation = designation;
	}

	   void print()// Creating print method
	   {
		   System.out.println("Id:- " +id+"\nName:- "+name+"\nDesignation:-" +designation+"\n");
	   }
}
	   
public class Main_Person 
{
	public static void main(String[] args) throws Exception,IOException
	{ 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Id:- ");
		int Id= Integer.parseInt( bf.readLine()); //Taking input from user
		
		System.out.println("Enter your name:- ");
		String Name =bf.readLine(); //Taking input from user
		
		Person p1= new Person(Id,Name); //Creating First object
		p1.print(); //Calling method
		
		System.out.println("Enter Your Name:-");
		String name=bf.readLine();
		
		System.out.println("Enter Your Designation:-");
		String Des = bf.readLine(); //Taking input from user
		
		Person p2=new Person(name,Des); //Creating Second object
		p2.print(); //Calling method
		

	}
	
}

