package com.venkatesh.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/venkatesh/ci/ciconfig.xml");
		Person p=(Person)context.getBean("person");
		System.out.println(p.toString());
	}

}
