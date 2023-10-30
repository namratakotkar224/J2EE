 package com.jspiders.designpatterens.creational;

public class StudentAdapter extends Student implements Game{

	@Override
	public void football() {
		// TODO Auto-generated method stub
		setId(1);
		setName("pratik");
		setEmail("pratik@gmail.com");
		System.out.println(getName()+"is a captain of football team");
	}

	@Override
	public void hocky() {
		// TODO Auto-generated method stub
		setId(2);
		setName("vaibhav");
		setEmail("vaibhav@gmail.com");
		System.out.println(getName()+"is a captain of football team");
	}

	
	
}
