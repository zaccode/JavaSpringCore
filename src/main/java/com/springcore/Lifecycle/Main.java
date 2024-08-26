package com.springcore.Lifecycle;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/config.xml");
		context.registerShutdownHook();
		Samosa s1 = (Samosa)context.getBean("samosa");
		System.out.println(s1);
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Pepsi p1 = (Pepsi)context.getBean("pepsi");
		System.out.println(p1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Example example = (Example)context.getBean("example");
		System.out.println(example);
	}

}
