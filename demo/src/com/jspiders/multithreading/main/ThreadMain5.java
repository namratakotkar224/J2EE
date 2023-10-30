package com.jspiders.multithreading.main;
import com.jspiders.multithreading.resource.Source;
import com.jspiders.multithreading.thread.MyThread7;
import com.jspiders.multithreading.thread.MyThread8;
public class ThreadMain5 {
	public static void main(String[] args) {
		Source source=new Source();
		MyThread7 mythread7=new MyThread7(source);
		mythread7.setName("mythread7");
		MyThread8 mythread8=new MyThread8(source);
		mythread8.setName("mythread8");
		
		mythread7.start();
		mythread8.start();
	}
}
