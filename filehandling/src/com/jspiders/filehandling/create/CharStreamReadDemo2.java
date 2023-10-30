package com.jspiders.filehandling.create;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Scanner;
public class CharStreamReadDemo2 {
	public static void main(String[] args) {
		File file=new File("devakashi.txt");
		if(file.exists()) {
			Scanner scanner=new Scanner();
			while(scanner.hasNextLine()) {
				System.out.println(scanner.hasNextLine());
				
			}
			System.out.println("data is fetched from the file");
			scanner.close();
		}
		else
		{
			System.out.println("file does not exist");
		}
	}
}
