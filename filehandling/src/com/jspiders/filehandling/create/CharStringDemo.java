package com.jspiders.filehandling.create;
import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
public class CharStringDemo {
	public static void main(String[] args) throws IOException{
		File file=new File("demo.txt");
		if(file.exists()) {
			FileReader filereader=new FileReader(file);
			int value=filereader();
			System.out.println(value);
			System.out.println("data is fetched from the file");
			filereader.close();
		}
	}

	private static int filereader() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
