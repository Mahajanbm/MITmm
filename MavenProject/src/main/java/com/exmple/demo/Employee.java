package com.exmple.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	final static String DRIVER_STRING="com.mysql.jdbc.Driver";
	final static String CON_STRING="jdbc:mysql://localhost:3306/3pm";
	final static String U_STRING="root";
	final static String PASS_STRING="1234";
	final static String INSER_STRING="insert into tblemployee (name,city,salary,dept,mail)values('nani','hyd',15452,'cs','nani@gmail.com')";
	final static String select="select id,name from tblemployee";
	final static String INSERT_STRING="insert into tblemployee(name,city) values('%s','%s')";
public static void main(String[] args) throws SQLException{
	

		try {

			Class.forName(DRIVER_STRING);
			Connection con=DriverManager.getConnection(CON_STRING,U_STRING,PASS_STRING);
			Scanner s1=new Scanner(System.in);
			//System.out.println("Eneter Employee id");
			//int  id=s1.nextInt();
			System.out.println("Eneter Employee name");
			String  name=s1.next();
			System.out.println("Eneter Employee city");
			String  city=s1.next();
			String str=String.format(INSERT_STRING,name,city);
			Statement st=con.createStatement();
			st.executeUpdate(str);
			System.out.println("data Inserted");
			//ResultSet rSet=st.executeQuery(select);
			///while(rSet.next())
			//{
			//	System.out.println(rSet.getInt(1)+" "+rSet.getString(2));
			//}
		//	System.out.println("Data inserted");
			
		//System.out.println("Driver loding ");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Driver not Found");
		}
		
	}
}
