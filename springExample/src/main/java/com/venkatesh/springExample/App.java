package com.venkatesh.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new  ClassPathXmlApplicationContext("com/venkatesh/springExample/config.xml");
       Student st=(Student)con.getBean("student");
       System.out.println(st);
       
    }
}
