package com.spring.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("qulifer.xml");
		Birds bird = context.getBean("bi", Birds.class);
		System.out.println(bird);

	}

}
