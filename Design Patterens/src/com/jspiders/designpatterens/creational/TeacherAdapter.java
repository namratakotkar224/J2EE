package com.jspiders.designpatterens.creational;

public class TeacherAdapter extends Teacher implements Game {
	@Override
	public void football() {
		// TODO Auto-generated method stub
		setId(1);
		setName("aman");
		setEmail("aman@gmail.com");
		System.out.println(getName()+"is a coach of football team");
	}

	@Override
	public void hocky() {
		// TODO Auto-generated method stub
		setId(2);
		setName("raj");
		setEmail("raj@gmail.com");
		System.out.println(getName()+"is a coach of football team");
	}
}
