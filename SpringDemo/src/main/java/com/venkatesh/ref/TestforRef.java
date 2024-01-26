package com.venkatesh.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestforRef {
	public static void main(String[] args) {
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/venkatesh/ref/Ref.xml");
		A ob=(A)context.getBean("aref");
		System.out.println(ob.getB());
		System.out.println(ob.getNum());
		System.out.println(ob.getB().getY());

	}
}
