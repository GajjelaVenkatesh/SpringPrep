package com.venkatesh.springExample;

import java.util.List;
import java.util.Map;

public class Student {
	
	private int id;
	private String name;
	Address ad;
	private List<String> details;
	private Map<String,String> subs;

	public Map<String, String> getSubs() {
		return subs;
	}
	public void setSubs(Map<String, String> subs) {
		this.subs = subs;
	}
	public Student(int id, String name, Address ad, List<String> details, Map<String, String> subs) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
		this.details = details;
		this.subs = subs;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ad=" + ad + ", details=" + details + ", subs=" + subs + "]";
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



}
