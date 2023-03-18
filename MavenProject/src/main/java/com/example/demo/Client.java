package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Client {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/dd","root","1234");
		System.out.println("connection sucess");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in code");
		}
		
		

	}

}
