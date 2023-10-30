package com.jspiders.designpatterens.creational;

public class Contact {
	private String firstName;
	private String lastName;
	private String dob;
	private long mobile;
	private long work;
	private long home;
	private int landline;
	private String email;
	private String website;
	private String address;
	
	

	public Contact(String firstName, String lastName, String dob, Long mobile, Long work, Long home, int landline,
			String email, String website, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobile = mobile;
		this.work = work;
		this.home = home;
		this.landline = landline;
		this.email = email;
		this.website = website;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Contact [FirstName=" + firstName + ", LastName=" + lastName + ", dob=" + dob + ", mobile=" + mobile
				+ ", work=" + work + ", Home=" + home + ", landline=" + landline + ", email=" + email + ", Website="
				+ website + ", address=" + address + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
