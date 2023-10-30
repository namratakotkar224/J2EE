package com.jspiders.filehandling.create;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:/demo/Testt.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("file is deleted");
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
