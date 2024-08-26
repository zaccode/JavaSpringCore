package com.springcore.standalone.collection;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/alone_config.xml");
		Person person = (Person)context.getBean("person1");
		System.out.println(person);
	}
}
