package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo1 {
	Operation op=new Operation();
	@Test
	public void test1()
	{
		int res=3011;
		int sum=op.add(10, 20);
		assertEquals(res, sum);
		System.out.println("Sucess");


	}
}
