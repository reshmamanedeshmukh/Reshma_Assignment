package com.yash.SpringIocEx.fourthex;

public class ConstructorMessage {

	String message=null;

	public ConstructorMessage(String message) {
		super();
		System.out.println("constructor called");
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	
	
}
