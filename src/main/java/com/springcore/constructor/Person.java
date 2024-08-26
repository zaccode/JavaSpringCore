package com.springcore.constructor;

public class Person {
	private String name;
	private int personId;
	private Cert cert;
	
	public Person(String name, int personId,Cert cert) {
		super();
		this.name = name;
		this.personId = personId;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId +" Certificate "+cert.getCert()+ "]";
	}
	
	
}
