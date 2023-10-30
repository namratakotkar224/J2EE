package com.jspiders.filehandling.create;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\demo\\Test.txt");
		if(file.exists())
		{
			System.out.println("file already exist");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("file is created");
			}
			catch(IOException e) {
				e.printStackTrace();
				System.out.println("file is created");
			}
		}
	}

}
