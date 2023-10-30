package com.jspiders.cardekho.main;

import java.util.Scanner;

import com.jspiders.cardekho.operation.CarOperation;

public class CarMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarOperation carOperation = new CarOperation();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to add car details. \nEnter 2 to remove car details. \nEnter 3 to update car details. \nEnter 4 to search car details.");
			System.out.println("Enter your choice : ");
			switch (scanner.nextInt()) {
			case 1:
				carOperation.addCar(scanner);
				break;
			case 2:
				carOperation.removeCar(scanner);
				break;
			case 3:
				carOperation.updateCar(scanner);
				break;
			case 4:
				carOperation.searchCar(scanner);
				break;
			default:
				System.out.println("Invalid Input");
				flag = false;
				break;
			}

		}
	}
}