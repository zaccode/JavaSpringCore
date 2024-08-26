package com.springcore.stereotype.springexpression;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/springexpression/springexpresion_config.xml");
		Demo demo = (Demo)context.getBean("demo",Demo.class);
		System.out.println(demo);
		
	}

}
