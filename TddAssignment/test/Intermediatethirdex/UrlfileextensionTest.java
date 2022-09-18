package com.yash.TddExample.Intermediatethirdex;
import static org.junit.Assert.assertEquals;

import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import com.yash.TddExample.Intermediatethirdex.TestCaseI3;
public class UrlfileextensionTest {
 TestCaseI3   testi3 = new TestCaseI3();
 
 @Test
 public void test_UrlCheck_returnIndex_AsOutput()
 {  
	 String url="index";
	 String  result=testi3.displayIndex();
	 assertEquals(url, result);
	 
 }
 @Test
 public void test_UrlCheck_returnsalary_AsOutput()
 {  
	 String url="salary";
	 String  result=testi3.displaySalary();
	 assertEquals(url, result);
	 
 }
 @Test
 public void test_UrlCheck_returnSearch_AsOutput()
 {  
	 String url="search";
	 String  result=testi3.displaySearch();
	 assertEquals(url, result);
	 
 }
 
 
}
