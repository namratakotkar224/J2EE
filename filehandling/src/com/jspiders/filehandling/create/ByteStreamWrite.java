package com.jspiders.filehandling.create;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("test.txt");
		if(file.exists())
		{
			FileOutputStream fileoutputstream=new FileOutputStream(file);
			fileoutputstream.write(20);
			System.out.println("data is written to the file");
			
		}
		else {
			System.out.println("file does not exists");
			file.createNewFile();
			System.out.println("file is created");
			
			FileOutputStream fileoutputstream=new FileOutputStream(file);
			fileoutputstream.write(20);
			System.out.println("data is written to the file");
			fileoutputstream.close();
		}
	}

}
