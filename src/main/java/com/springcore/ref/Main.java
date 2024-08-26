package com.springcore.ref;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ref/ref_config.xml");
		A a= (A)context.getBean("aref");
		
		System.out.println(a);
	}

}
