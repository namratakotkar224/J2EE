package com.jspiders.filehandling.create;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("demo.java");
		if(file.exists())
		{
			System.out.println("file already exists");
		}
		else
		{
			try {
				file.createNewFile();
				System.out.println("file created successfully");
			}
			catch(IOException e)
			{
				System.out.println("file not created");
				e.printStackTrace();
			}
		}
				
	}

}
