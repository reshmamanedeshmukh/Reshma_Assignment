package com.yash.TddExample.Intermediatesixthex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TddExample.Intermediatefifthex.Student;

public class BookTest {
Test1 t=new Test1();

@Test
public void test_ShouldReturn_Book_AsOutput() 
{
	 
	int count=t.bookcount("balaguruswamy");
	assertEquals(count, 3);
	
}

}
