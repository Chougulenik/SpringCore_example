package com.spring.annotation.qualifier;

public class Flyable {

	private String nameofBird;
	private int birdId;

	public String getNameofBird() {
		return nameofBird;
	}

	public void setNameofBird(String nameofBird) {
		this.nameofBird = nameofBird;
	}

	public int getBirdId() {
		return birdId;
	}

	public void setBirdId(int birdId) {
		this.birdId = birdId;
	}
	
	public void flyBird() {
		System.out.println("Birds are flyable");
	}
}