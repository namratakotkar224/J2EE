package com.jspiders.filehandling.create;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class CharStreamWrite {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("tanu.txt");
		if(file.exists()) {
			FileWriter filewriter=new FileWriter(file);
			filewriter.write("hello world");
			System.out.println("data is written to the file");
			filewriter.close();
			
		}
		else {
			System.out.println("file does not exist.");
			file.createNewFile();
			System.out.println("file is created");
			FileWriter filewriter=new FileWriter(file);
			filewriter.write("hello world");
			System.out.println("data is written to the file");
			filewriter.close();
		}
	}

}
