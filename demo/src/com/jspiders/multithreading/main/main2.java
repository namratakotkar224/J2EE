package com.jspiders.multithreading.main;
import com.jspiders.multithreading.thread.MyThread3;
import com.jspiders.multithreading.thread.MyThread4;
public class main2 {

	public static void main(String[] args) {
		MyThread3 mythread3=new MyThread3();
		mythread3.setName("thread3");
		
		MyThread4 mythread4=new MyThread4();
		mythread4.setName("thread4");
			
		mythread3.start();
		mythread4.start();
	}

}
