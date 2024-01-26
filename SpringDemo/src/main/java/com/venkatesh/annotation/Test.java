package com.venkatesh.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/venkatesh/annotation/annotationconfig.xml");
		Person person=context.getBean("person",Person.class);
		System.out.println(person);

	}

}
