package com.yash.TddExample.stringassignmenttwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MemberTest {
	
	MemberInfo mi=new MemberInfo();
	
	@Test
	public void test_member_String_as_output()
	{
	 String str=mi.showMemberDetail();
	 mi.setFirstName("Pankaj");

	 mi.setLastName("Sharma");
	 mi.setEmail("sharma.pankaj@yash.com");
	 mi.setPassword("12345");
	 mi.setRole("Trainer");
	 assertEquals(str,"{name:"+"Pankaj"+" "+"Sharma" +",email :"+ "sharma.pankaj@yash.com"+", password :"+"12345"+", role:"+"Trainer"+"}");
		
	}

}
