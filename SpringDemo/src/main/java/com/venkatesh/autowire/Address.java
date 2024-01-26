package com.venkatesh.autowire;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}

	public Address(String street) {
		super();
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address() {
		super();

	}
}
