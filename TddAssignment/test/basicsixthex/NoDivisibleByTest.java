package com.yash.TddExample.basicsixthex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoDivisibleByTest {
	
	NoDivisibleBy7 t= new NoDivisibleBy7();
	/*@Test
	public void test_TestSumOfNumbers1()
	{
		assertEquals(t.add(), 500);
	}
	*/
	@Test
	public void test_TestSumOfNumbers2()
	{
		assertEquals(t.add(), 2107);
	}
	

}
