package com.jspiders.multithreading.thread;

public class MyThread6 extends Thread{
	public void run() {
		String str="hello world";
		char [] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}