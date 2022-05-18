package com.spring.annotation.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
		Bird birds = context.getBean("bird", Bird.class);
		birds.flyBird();
	}

}
