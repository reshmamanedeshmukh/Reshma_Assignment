package com.yash.TddExample.Intermediatefourthex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoOfCarSoldTest {
	CarShopApp capp=new CarShopApp();
	
	@Test
	public void test_ShouldReturn_Book_AsOutput() 
	{
		 
		int count=capp.NoofCarSold();
		assertEquals(count, 7);
		
	}

}
