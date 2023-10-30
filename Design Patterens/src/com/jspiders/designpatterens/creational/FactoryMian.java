package com.jspiders.designpatterens.creational;

import java.io.IOException;
import java.util.Scanner;

public class FactoryMian {
	private static Beverage beverage;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			factory().order();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("beverage is not ordered");
		}
		
		
	}
	private static Beverage factory() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 to order masala tea\n 2 to order ginger tea\n 3 to order lemon tea\n 4 to order green tea");
		System.out.println("enter your choice");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			beverage=new MasalaTea();
			break;
		
		case 2:
			beverage new GingerTea();
			break;
			
		case 3:
			beverage new LemonTea();
			break;
			
		case 4:
			beverage new GreenTea();
			break;
			
			default:
				System.out.println("Invalid choice");
		}
		scanner.close();
		return beverage;
	}
}
