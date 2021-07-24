package com.cod.cobj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cmainmanipulate implements cobj
{
  String url="jdbc:mysql://localhost:3306/";
  String dbname="emp";
  String uname="root";
  String pwd="root";
  Connection con;
  Statement stmt;
	@Override
	public void initDB() throws SQLException {
		// TODO Auto-generated method stub
		con=DriverManager.getConnection(url+dbname,uname,pwd);
		stmt=con.createStatement();
		System.out.println("Getting connected to the database");
	}

	@Override
	public void insert(int id, String name, String place) throws SQLException {
		// TODO Auto-generated method stub
		
		String insert ="insert into emp.sales values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, place);
		ps.executeUpdate();
		System.out.println("one record inserted");
		
			
	}

	@Override
	public void update(int id, String name) throws SQLException {
		// TODO Auto-generated method stub
		String updateQuery="update emp.sales set name= ? where id=?";
		PreparedStatement ps=con.prepareStatement(updateQuery);
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.executeUpdate();
		System.out.println("one row updated");
		
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		String deleteQuery="delete from emp.sales where id=?";
		PreparedStatement ps=con.prepareStatement(deleteQuery);
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("one row deleted ");
	}

	@Override
	public void select() throws SQLException {
		// TODO Auto-generated method stub
		String select="select * from emp.sales";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(select);
		while(res.next()==true)
		{
			int id=res.getInt(1);
			String name=res.getString(2);
			String place=res.getString(3);
			System.out.println(id+""+name+"" +place);
		}
	}

	@Override
	public void selectuser(int id) throws SQLException {
		// TODO Auto-generated method stub
		String selectQuery="select * from emp.sales where id="+id;
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(selectQuery);
		res.next();
		int uid=res.getInt(1);
		String name=res.getString(2);
		String place=res.getString(3);
		System.out.println(uid+" "+name+" " +place);
		
		
		
	}

	@Override
	public void closeDB() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}