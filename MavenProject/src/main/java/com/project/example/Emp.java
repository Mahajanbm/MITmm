package com.project.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;



public class Emp {
	final static String INSERT_STRING="insert into tblemp(name,city,salaray)values(?,?,?)";

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Properties  properties=new Properties();
		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\main\\java\\db.properties");
		properties.load(f1);
		String driverString=properties.getProperty("driver");
		String connString=properties.getProperty("constring");
		String user=properties.getProperty("user");
		String pas=properties.getProperty("pass");
		Class.forName(driverString);
		Connection connection=DriverManager.getConnection(connString,user,pas);
		System.out.println("connected");
		Scanner s1=new Scanner(System.in);
		System.out.println("Eneter name");
		String nameString=s1.next();
		System.out.println("Eneter city");
		String city=s1.next();
		System.out.println("Eneter salary");
		float salary=s1.nextFloat();
		
		
		PreparedStatement ps=connection.prepareStatement(INSERT_STRING);
		ps.setString(1, nameString);
		ps.setString(2, city);
		ps.setFloat(3, salary);
		
		ps.executeUpdate();
		
	}

}
