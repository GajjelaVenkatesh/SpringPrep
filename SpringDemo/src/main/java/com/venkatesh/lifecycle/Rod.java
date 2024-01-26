package com.venkatesh.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rod implements DisposableBean ,InitializingBean{
	private int length;

	public Rod(int length) {
		super();
		this.length = length;
	}

	public Rod() {
		super();
	}

	@Override
	public String toString() {
		return "Rod [length=" + length + "]";
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("inti");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method is called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Destroy method is called");
		
	}
}