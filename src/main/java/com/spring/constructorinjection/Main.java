package com.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
		Person personInfo = context.getBean("info", Person.class);
		System.out.println(personInfo);

	}

}
