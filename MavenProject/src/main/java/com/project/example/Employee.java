package com.project.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	final static String INSERT_STRING="insert into tblemp (id,name,city,salaray)values(101,'mahajan','hyd',5452)";
	final static String DELETE_STRING="delete from tblemp where id=101" ;
	final static String UPDATE_STRING="update tblemp set name='ram' where id=101";	
	final static String SELECT_STRING="select id,name  from tblemp";
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dddd","root","1234");
			System.out.println("Helloo");
			Statement statement=connection.createStatement();
			//statement.executeUpdate(UPDATE_STRING);
			ResultSet rSet=statement.executeQuery(SELECT_STRING);
			while(rSet.next())
			{
				System.out.println(rSet.getInt(1)+" "+rSet.getString(2));
			}
			System.out.println("Data deleted ");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Class not found");
		}
		

	}

}
