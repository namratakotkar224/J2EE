package com.jspiders.designpatterens.creational;

public class SingletoneagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEager object1=SingletonEager.getobject();
		SingletonEager object2=SingletonEager.getobject();
		SingletonEager object3=SingletonEager.getobject();
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}

}
