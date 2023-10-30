package com.jspiders.multithreading.thread;
import com.jspiders.multithreading.resource.Source;
public class MyThread8 extends Thread{
	private Source source;
	public MyThread8(Source source)
	{
		super();
		this.source=source;
	}
	public void run()
	{
		synchronized(source.resource2)
		{
			System.out.println("look is applied on resource2 by"+this.getName());
		
		synchronized(source.resource1)
		{
			System.out.println("look is applied on resource1 by"+this.getName());
		}
		}
}
}
