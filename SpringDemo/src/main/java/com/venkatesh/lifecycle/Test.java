package com.venkatesh.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/venkatesh/lifecycle/lifecycleconfig.xml");
		Rod rod=(Rod)context.getBean("rod");
		System.out.println(rod);

	}

}
