package com.jspiders.cardekho.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.cardekho.car.Car;

public class CarOperation {
	ArrayList<Car> arrayList = new ArrayList<Car>();
	public void addCar(Scanner scanner)
	{
		Car car = new Car();
		System.out.println("Enter car Id : ");
		car.setId(scanner.nextInt());
		System.out.println("Enter car name : ");
		car.setName(scanner.next());
		System.out.println("Enter car brand : ");
		car.setBrand(scanner.next());
		System.out.println("Enter car price : ");
		car.setPrice(scanner.nextInt());
		arrayList.add(car);
		System.out.println("Car details added successfully.");

	}
	public void removeCar(Scanner scanner)
	{
		System.out.println("Enter car id to remove : ");
		int carIdToRemove = scanner.nextInt();
		for(Car car : arrayList) {
			if(car.getId() == carIdToRemove) {
				arrayList.remove(car);
				System.out.println("Car removed successfully.");
				return;
			}
		}
		System.out.println("Car with ID " + carIdToRemove + " not found.");
	}
	public void updateCar(Scanner scanner)
	{
		System.out.println("Enter car id to update : ");
		int carIdToUpdate = scanner.nextInt();
		for(Car car : arrayList ) {
			if(car.getId() == carIdToUpdate) {
				System.out.println("Enter new car name : ");
				car.setName(scanner.next());
				System.out.println("Enter new car brand : ");
				car.setBrand(scanner.next());
				System.out.println("Enter new car price : ");
				car.setPrice(scanner.nextInt());
				return;
			}
		}
		System.out.println("Car with ID " + carIdToUpdate + " not found.");
	}
	public void searchCar(Scanner scanner)
	{
		System.out.println("Enter the car name to search : ");
		String carNameToSearch = scanner.next();

		boolean found = false;
		for(Car car : arrayList ) {
			if(car.getName().equalsIgnoreCase(carNameToSearch)) {
				System.out.println("Car Found - Id: " + car.getId() + " , Name: " + car.getName() + " , Brand: " + car.getBrand() + " , Price: " + car.getPrice());
				found = true;
			}
		}

		if(!found) {
			System.out.println("Car with name " + carNameToSearch + " not found.");
		}
	}
}