package com.venkatesh.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/venkatesh/standalone/standaloneconfig.xml");
		Person p=context.getBean("person1",Person.class);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p);
		
	}

}
