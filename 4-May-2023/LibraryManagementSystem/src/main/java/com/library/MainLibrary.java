package com.library;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;


public class MainLibrary 
{
	public static void main(String[] args) throws Exception,SQLSyntaxErrorException
	{
		LibraryConnection lc = new LibraryConnection();
		Connection con = lc.create();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				while(true)
				{
					System.out.println("-------------Library Management System-------------");
					System.out.println("1. Insert Book Record into Table");
       				System.out.println("2. Update Book Record from Table");
					System.out.println("3. Delete Book Record from Table");
					System.out.println("4. Display All book Record");
					System.out.println("5. Exit");
					System.out.println("Enter Choice(1..5) ");
					
					switch(Integer.parseInt(br.readLine()))
					{			
				case 1:
					System.out.println("\nEnter Book Id:-");
					int Bookid=Integer.parseInt(br.readLine());
					System.out.println("\nEnter Book Name:-");
					String Bookname =br.readLine();
					System.out.println("\nEnter Author Name:-");
					String Authorname=br.readLine();
					
					if(lc.insert(con, Bookid, Bookname, Authorname)==1) 
					{
						System.out.println("Data Inserted Successfully");
					}
					else
					{
						System.out.println("Something wrong");
					}
					break;
					
				case 2:
					System.out.println("\nEnter Book_Id:-");
					if(lc.update(con, Integer.parseInt(br.readLine()))==1)
					{
						System.out.println("Data Update Successfully");
					}
					else
					{
						System.out.println("Data not found");
					}
					break;
					
				case 3:
					System.out.println("\nEnter Book_Id");
					if(lc.delete(con,Integer.parseInt(br.readLine()))==1)
					{
						System.out.println("Data deleted");
					}
					else
					{
						System.out.println("Data not found");
					}
					break;
					
				case 4:
					ResultSet rs =lc.select(con);
					System.out.println("\n-----Book records in table---");
					while(rs.next())
					{
						System.out.println(rs.getInt("Bookid")+"\t\t"+rs.getString("BookName")+"\t\t"+rs.getString("AuthorName"));
					}
					break;
					default:
						System.out.println("correct option");
						break;
					
						
						
					}
					}			
					
					

	}
}
	
	

	