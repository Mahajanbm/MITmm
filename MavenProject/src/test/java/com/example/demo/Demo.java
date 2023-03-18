package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Demo {
	
	
	@BeforeClass
	public static void dd()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public static void dd1()
	{
		System.out.println("after class");
	}
	@Before
	public void d()
	{
		System.out.println("Before each method");
		
	}
	@After
	public void d1()
	{
		System.out.println("after each method");

	}
	@Test
	public void demo()
	{
		String str="Mit";
		String str2="Mit";
		assertEquals(str, str2);
		System.out.println("demo");

	}
	//@Ignore
	@Test
	public void demo1()
	{

		System.out.println("demo1");

	}

}
