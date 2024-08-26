package com.springcore.stereotype.annotation;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereotype_config.xml");
		Student student = (Student)context.getBean("student",Student.class);
		System.out.println(student);
//		System.out.println(student.getAddress());
		System.out.println(student.hashCode());
		
		Student student2 = (Student)context.getBean("student",Student.class);
		System.out.println(student2.hashCode());
	}

}
