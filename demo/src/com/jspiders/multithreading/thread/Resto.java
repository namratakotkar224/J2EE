package com.jspiders.multithreading.thread;
import com.jspiders.multithreading.resource.Paratha;
public class Resto extends Thread{
	private Paratha paratha =new Paratha();
	public Resto(Paratha paratha)
	{
		super();
		this.paratha=paratha;
	}
	public void run() {
		paratha.orderparatha(5);
		
	}
}
