package com.jspiders.multithreading.main;
import com.jspiders.multithreading.resource.Account;
import com.jspiders.multithreading.thread.Husband;
import com.jspiders.multithreading.thread.Wife;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(10000);
		Husband husband=new Husband();
		Wife wife=new Wife();
		
		husband.start();
		wife.start();
	}

}
