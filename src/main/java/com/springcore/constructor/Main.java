package com.springcore.constructor;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/constructor_config.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person);
		
	}

}
