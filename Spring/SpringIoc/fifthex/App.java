package com.yash.SpringIocEx.fifthex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/SpringIocEx/fifthex/ciconfig.xml");
			SetterMessage bean = context.getBean("sm",SetterMessage.class);
			System.out.println(bean);
}
}
