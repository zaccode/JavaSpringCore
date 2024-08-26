package com.springcore.Lifecycle;

public class Samosa {
	//Implement Bean Life cycle using xml
	private int price;
	
	public Samosa(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting the price");
		this.price = price;
	}

	public Samosa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	//you can also change the name of the init and destroy method according to your perpective
	public void init() {
		System.out.println("Inside the Init Method");
	}
	
	public void destroy() {
		System.out.println("Inside the Destroy Method");
	}
	
}
