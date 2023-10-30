package com.jspiders.filehandling.create;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ByteStreamRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("demo.txt");
		if(file.exists()) {
			FileInputStream fileinputstream=new FileInputStream(file);
			int value=fileinputstream.read();
			System.out.println("data is fetched from the file");
			fileinputstream.close();
			
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
