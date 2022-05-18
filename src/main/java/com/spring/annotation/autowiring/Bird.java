package com.spring.annotation.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Bird {

	private Flyable fly;

	public Bird() {

	}

	// @Autowired
	public Bird(Flyable fly) {
		this.fly = fly;
	}

	@Autowired
	public void setFly(Flyable fly) {
		this.fly = fly;
		System.out.println("setter method called");
	}

	public void flyBird() {
		fly.flyBird();
	}
}
