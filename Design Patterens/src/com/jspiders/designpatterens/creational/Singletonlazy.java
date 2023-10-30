package com.jspiders.designpatterens.creational;

public class Singletonlazy {
	private static Singletonlazy singletonlazy;
	private Singletonlazy() {
		
	}
	public static Singletonlazy getobject() {
		if(singletonlazy==null) {
			singletonlazy=new Singletonlazy();
			
		}
		return singletonlazy;
	}
}
