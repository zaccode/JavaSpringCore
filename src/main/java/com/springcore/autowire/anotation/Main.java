package com.springcore.autowire.anotation;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/anotation/autowire_config.xml"); 
//		Address address = (Address)context.getBean("address");	
//		System.out.println(address);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Emp emp = (Emp)context.getBean("emp1",Emp.class);
		System.out.println(emp);
	}

}
