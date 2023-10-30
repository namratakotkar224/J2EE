package com.jspiders.designpatterens.creational;

public class SingletonlazyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletonlazy object1=Singletonlazy.getobject();
		Singletonlazy object2=Singletonlazy.getobject();
		Singletonlazy object3=Singletonlazy.getobject();
	
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}

}
