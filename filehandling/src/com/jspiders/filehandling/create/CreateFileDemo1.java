package com.jspiders.filehandling.create;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("demo.exe");
		try {
			file.createNewFile();
			System.out.println("file is successfully created");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
