package com.spring.list;

public class Friends {
	private String friendName;

	public Friends() {
		super();
	}

	public Friends(String friendName) {
		this.friendName = friendName;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	@Override
	public String toString() {
		return "Friends [friendName=" + friendName + "]";
	}
	
	
	
	

}
