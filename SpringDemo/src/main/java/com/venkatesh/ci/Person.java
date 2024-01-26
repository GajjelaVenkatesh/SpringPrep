package com.venkatesh.ci;

public class Person {
	private String name;
	Certi certi;


	public Person(String name, Certi certi) {
		super();
		this.name = name;
		this.certi = certi;
	}


	@Override
	public String toString() {
		return this.name;
	}
	

}
