package com.kod.sales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			
			Statement stmt=con.createStatement();
			String update="update emp.sales set name= 'jivan' where id=2";
			stmt.execute(update);
			
			String select ="select * from emp.sales";
			ResultSet res=stmt.executeQuery(select);
			
			
			while(res.next()==true)
			{
				int id=res.getInt(1);
				String name=res.getString(2);
				String place=res.getString(3);
				System.out.println(id +" " + name);
				
			}
			
			
			
		}
		
		catch(SQLException e)
		{
			System.out.println("Exception handled");
		}
	}
	
	
	
}
