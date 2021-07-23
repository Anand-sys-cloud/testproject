package com.kod.sales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hello

{
 
	public static void main(String args[])
	{
		String url="jdbc:mysql://localhost:3306/";
		String dbname="emp";
		String uname="root";
		String pwd="root";
		
		try
		{
			Connection con=DriverManager.getConnection(url+dbname,uname,pwd);
			
			System.out.println("connection  established");
			
			
			
			
		}
		
		catch(SQLException e)
		{
			System.out.println("Exception handled");
		}
	}
	
	
	
}
