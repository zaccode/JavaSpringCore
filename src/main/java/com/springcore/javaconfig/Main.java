package com.springcore.javaconfig;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = (Student)context.getBean("firstStudent",Student.class);
		Student student = (Student)context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
	}
}
