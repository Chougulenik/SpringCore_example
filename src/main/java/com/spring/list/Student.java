package com.spring.list;

import java.util.List;

public class Student {

	private String name;
	Address address;
	private List<Friends> friends;
	
	public Student() {
		
	}

	public Student(String name, Address address, List<Friends> friends) {
		this.name = name;
		this.address = address;
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Friends> getFriends() {
		return friends;
	}

	public void setFriends(List<Friends> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", friends=" + friends + "]";
	}
	
	
	
	
}
