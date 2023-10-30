package com.jspiders.multithreading.resource;

public class Paratha {
	private int availableparatha;
	public synchronized void orderparatha(int numberofparatha) {
		if(numberofparatha > availableparatha) {
			System.out.println(numberofparatha +"parathas not available. please wait for sometimes");
			try {
				wait();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			availableparatha -= numberofparatha;
			System.out.println("order for"+ numberofparatha +"parathas is successful");
		}
	}
	public synchronized void prepareparatha(int numberofparatha) {
		System.out.println(numberofparatha +"parathas are getting prepared");
		availableparatha += numberofparatha;
		System.out.println(availableparatha +"parathas are available");
		notify();
	}
}
