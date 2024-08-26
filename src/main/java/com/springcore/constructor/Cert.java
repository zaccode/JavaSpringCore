package com.springcore.constructor;

public class Cert {
	private String cert;
	
	public Cert(String cert) {
		super();
		this.cert = cert;
	}

	public String getCert() {
		return cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
	}

	public Cert() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cert [cert=" + cert + "]";
	}

}
