package com.jspiders.multithreading.main1;
import com.jspiders.multithreading.thread1.MyThread2;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mythread2=new MyThread2();
		Thread thread=new Thread(mythread2);
		thread.start();
	}

}
