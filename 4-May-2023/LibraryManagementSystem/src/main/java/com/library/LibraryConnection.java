package com.library;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryConnection 
{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	//This function will return connection obj
	Connection create() throws Exception
	{
		
			String url ="jdbc:mysql://localhost:3306/practical";
			String username="root";
			String password="0727";
			Connection con= DriverManager.getConnection(url,username,password);
			
			//For Creating table it will call every time any check if table is exist or not and according 
			//that it will create the tale
				String qc="create table library("
						+ "BookId int(10) primary key,"
						+ " BookName varchar(100) not null, "
						+ "AuthorName varchar(50))";
				Statement stmt=con.createStatement();
				stmt.execute(qc); //executing query
				System.out.println("The table is created successfully");
			return con;
	}
				//This Function will return 1 if record is inserted into table other wise it will  return 0
				int insert(Connection con, int Bookid, String Bookname,String Authorname) throws Exception
				{
					PreparedStatement pst= con.prepareStatement("insert into library(BookId,BookName,AuthorName) values(?,?,?);");
					pst.setInt(1,Bookid);
					pst.setString(2, Bookname);
					pst.setString(3, Authorname);
					System.out.println("Data inserted successfully");
					return pst.executeUpdate();
				}
					
				//This function will return 1 if record is updated in table other wise it will return 0
				int update(Connection con,int Bookid) throws Exception
				{
                 int ch = 0;
				
					System.out.println("What you want to update 1. AuthorName or 2. BookName");
					System.out.println("Enter your choice:-");
					switch(Integer.parseInt(br.readLine()))
					{
						case 1:
							PreparedStatement pu = con.prepareStatement("update library setBookName=? where BookId=?");
							System.out.println("Enter BookName:-");
							pu.setString(1,br.readLine());
							pu.setInt(2,Bookid);
							return pu.executeUpdate();
						case 2:
							PreparedStatement pu2 =con.prepareStatement("update library set AuthorName=? where BookId=?");
							System.out.println("Enter AuthorName");
							pu2.setString(1,br.readLine());
							pu2.setInt(2,Bookid);
							return pu2.executeUpdate();
							default:
								System.out.println("Invalid data");
					}
					return 0;
				}
				
				//This function will return 1 if record is deleted from table, other wise it will return 0
				int delete(Connection con, int Bookid) throws Exception
				{
					PreparedStatement pd =con.prepareStatement("delete from library where BookId=?");
					pd.setInt(1, Bookid);
					return pd.executeUpdate();	
				}
		
				//This Function will return Result set obj
				ResultSet select(Connection con) throws Exception
				{
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select * from library");
					return rs;
					
				}
				
					
				}
					
					
				
				
			
			
			
	
	
				
				
