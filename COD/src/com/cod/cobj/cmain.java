package com.cod.cobj;

import java.sql.SQLException;

public class cmain
{
	public static void main(String[] args) {
		cmainmanipulate ms=new cmainmanipulate();
		
		try 
		{
			ms.initDB();
			//ms.insert(5, "ganga", "bgk");
			//ms.update(4,"arundati");
			//ms.delete(3);
			ms.select();
			//ms.selectuser(5);
			//ms.alter();
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}