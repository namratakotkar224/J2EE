package com.jspiders.designpatterens.creational;

public class SingletonEager {
	private static SingletonEager singletoneager=new SingletonEager();
	private void singletoneager() {
		
	}
	public static SingletonEager getobject() {
		return singletoneager;
	}
}
