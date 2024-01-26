package com.venkatesh.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.venkatesh.spel.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/venkatesh/spel/spel.xml");
		Person person=context.getBean("person",Person.class);

		System.out.print(person);
	}

}
