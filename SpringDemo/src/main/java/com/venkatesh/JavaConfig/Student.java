package com.venkatesh.JavaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


//@Component("student")
public class Student {
	
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		this.samosa.eat();
		return "Student [samosa=" + samosa + "]";
	}

	public void display() {
		System.out.println("in display");
		
	}

}
