package com.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setterinjection.xml");
		Person list = context.getBean("person", Person.class);
		System.out.println(list);
	}

}
