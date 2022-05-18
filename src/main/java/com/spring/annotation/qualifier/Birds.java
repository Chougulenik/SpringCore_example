package com.spring.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Birds {

	@Autowired
	@Qualifier("fly1")
	private Flyable fly;

	public Birds() {

	}

	// @Autowired
	public Birds(Flyable fly) {
		this.fly = fly;
	}

	public void setFly(Flyable fly) {
		this.fly = fly;
		System.out.println("setter method called");
	}

	public void flyBird() {
		if(fly != null) {
			fly.flyBird();
			System.out.println(fly.getNameofBird() + " "+fly.getBirdId());
		}
		else {
			System.out.println("no birds");
		}
	}	
}
