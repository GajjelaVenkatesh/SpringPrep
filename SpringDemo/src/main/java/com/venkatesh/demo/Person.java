package com.venkatesh.demo;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private List<String> phns;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phns=" + phns + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person() {
		super();
	}
	public List<String> getPhns() {
		return phns;
	}
	public void setPhns(List<String> phns) {
		this.phns = phns;
	}
}
