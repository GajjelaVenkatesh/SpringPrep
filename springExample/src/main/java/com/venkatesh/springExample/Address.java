package com.venkatesh.springExample;

public class Address {
	private String street;
	private String village;
	@Override
	public String toString() {
		return "Address [street=" + street + ", village=" + village + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String village) {
		super();
		this.street = street;
		this.village = village;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}

}
