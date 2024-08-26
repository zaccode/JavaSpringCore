package com.springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	//Implement Bean LifeCycle using Interface
	private double price;
	
	
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("Taking pepsi :init");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("Going to put back to Shop : Destroy");
	}
	
}
