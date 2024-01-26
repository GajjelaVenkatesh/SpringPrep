package com.venkatesh.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
		Student st=(Student)con.getBean("getStudent");
		System.out.println(st);
		st.display();

	}

}
