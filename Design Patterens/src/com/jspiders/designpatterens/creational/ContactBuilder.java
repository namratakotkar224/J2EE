package com.jspiders.designpatterens.creational;

public class ContactBuilder {
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
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		lastName = lastName;
	}
	public String getdob() {
		return dob;
	}
	public void setdob(String dob) {
		this.dob = dob;
	}
	public long getmobile() {
		return mobile;
	}
	public void setmobile(long mobile) {
		this.mobile = mobile;
	}
	public long getwork() {
		return work;
	}
	public void setwork(Long work) {
		this.work = work;
	}
	public long gethome() {
		return home;
	}
	public void sethome(Long home) {
		home = home;
	}
	public int getlandline() {
		return landline;
	}
	public void setlandline(int landline) {
		this.landline = landline;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getwebsite() {
		return website;
	}
	public void setwebsite(String website) {
		website = website;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public Contact bulidContract()
	{
		return new Contact(firstName,lastName,dob,mobile,work,home,landline,email,website,address);
	}
	
	
	
	
}
