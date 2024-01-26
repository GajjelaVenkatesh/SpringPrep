package com.venkatesh.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.venkatesh.JavaConfig")
public class Config {
	@Bean
	public Student getStudent(){
		return new Student(eatsamosa());
	}
	@Bean 
	public Samosa eatsamosa() {
		return new Samosa();
		
	}
	

}
