package com.venkatesh.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student obj1 = (Student) context.getBean("student1");
		Student obj2=(Student) context.getBean("student2");
		
		System.out.println(obj1);
		System.out.println(obj2);


	}
}
