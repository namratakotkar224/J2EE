package com.jspiders.designpatterens.creational;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAdapter studentadapter=new StudentAdapter();
		studentadapter.football();
		studentadapter.hocky();
		
		TeacherAdapter teacheradapter=new TeacherAdapter();
		teacheradapter.football();
		teacheradapter.hocky();
	}

}
