package com.springcore.collections;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection_config.xml");
		Emp emp = (Emp)context.getBean("student1");
		System.out.println(emp);
	}

}
