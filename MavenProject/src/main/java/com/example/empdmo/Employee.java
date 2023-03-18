package com.example.empdmo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;

public class Employee {
	final static String INSERT_STRING ="insert into emp(id,name,city,salary) values(?,?,?,?)";
	final static String DELE_STRING="delete from emp where id=?";
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Properties psProperties=new Properties();

		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\main\\java\\db.properties");
		psProperties.load(f1);
		String drievrString=psProperties.getProperty("driver");
		String constring=psProperties.getProperty("constring1");
		String userString=psProperties.getProperty("user");
		String passString=psProperties.getProperty("pass");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enetr Id");
		int id=s1.nextInt();
		//System.out.println("Eneter Name");
		//String nameString=s1.next();
		//System.out.println("Enter city");
		//String cityString =s1.next();
		//System.out.println("Enter Salary");
		//float salary=s1.nextFloat();
		Class.forName(drievrString);
		Connection connection=DriverManager.getConnection(constring,userString,passString);
		PreparedStatement pStatement=connection.prepareStatement(DELE_STRING);
		pStatement.setInt(1, id);
		//pStatement.setString(2, nameString);
		//pStatement.setString(3, cityString);

		//pStatement.setFloat(4, salary);
		pStatement.executeUpdate();
		System.out.println("Inserted Sucess full");

	}

}
