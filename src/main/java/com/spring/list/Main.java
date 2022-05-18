package com.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("listinject.xml");
		Student stud = context.getBean("student", Student.class);
		System.out.println(stud);
		

	}

}
