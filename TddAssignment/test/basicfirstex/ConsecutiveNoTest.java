package com.yash.TddExample.basicfirstex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConsecutiveNoTest {
	
	
ConsecutiveNoEx sut= new ConsecutiveNoEx();
    
    @Test
    public void consecutiveNumsSumTest01() {
    
        assertEquals(55, sut.consecutiveNumsSum(10));
    }
    
   

	@Test
    public void consecutiveNumsSumTest02() {
    
        assertEquals(0, sut.consecutiveNumsSum(0));
    }
    
    
    @Test
    public void consecutiveNumsSumTest03() {
    
        assertEquals(45, sut.consecutiveNumsSum(9));
    }
    
}
