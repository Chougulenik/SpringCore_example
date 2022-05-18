package com.spring.annotation.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");
		SingletonDemo obj1 = context.getBean("singletonDemo", SingletonDemo.class);
		SingletonDemo obj2 = context.getBean("singletonDemo", SingletonDemo.class);
		System.out.println(obj1 +" "+obj2);
		
		TeacherXml teach1 = context.getBean("teacher", TeacherXml.class);
		TeacherXml teach2 = context.getBean("teacher", TeacherXml.class);
		
		System.out.println(teach1.hashCode()+ " "+ teach2.hashCode());
	}

}
