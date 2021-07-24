package com.cod.cobj;

import java.sql.SQLException;

public interface cobj
{
	public void initDB() throws SQLException;
	public void insert(int id,String name,String place) throws SQLException;
	public void update(int id, String name) throws SQLException;
	public void delete(int id) throws SQLException;
	public void select() throws SQLException;
	public void selectuser(int id) throws SQLException;
	public void closeDB() throws SQLException;
	
}