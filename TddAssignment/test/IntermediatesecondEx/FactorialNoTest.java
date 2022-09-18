package com.yash.TddExample.IntermediatesecondEx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TddExample.basicsecondex.FactorialNoEx;

public class FactorialNoTest {
	
	
	FactorialNoEx f = new FactorialNoEx();
	@Test
	public void test_Factorial_ShouldReturn_FactorialOfNumber_AsLong() 
	{
		long result=f.factorial();
		assertEquals(result, 720);
		
	}

}
