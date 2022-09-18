package com.yash.TddExample.Intermediateseventhex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeCountTest {

	AppTest app=new AppTest();
	
	
	@Test
	public void test_countemployee_return_count_asoutput()
	{
		int countemp=app.countemployee();
		assertEquals(countemp,5);
	}
	
}
