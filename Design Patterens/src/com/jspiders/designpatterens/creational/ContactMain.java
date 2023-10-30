package com.jspiders.designpatterens.creational;

public class ContactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact=new ContactBuilder();
		mobile(987654321).firstName("dev").lastName("Arora").buildcontact();
		System.out.println(contact);

	}

	
	

	
	

	
}
