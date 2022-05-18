package com.spring.annotation.prototypebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");
		PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
		PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
		System.out.println(obj1 +" "+obj2);
		
		TeacherXml teach1 = context.getBean("teacher", TeacherXml.class);
		TeacherXml teach2 = context.getBean("teacher", TeacherXml.class);
		
		System.out.println(teach1.hashCode()+ " "+ teach2.hashCode());
	}

}
