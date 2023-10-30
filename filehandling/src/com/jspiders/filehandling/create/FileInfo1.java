package com.jspiders.filehandling.create;
import java.io.File;
public class FileInfo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("Dev.txt");
		if(file.exists()) {
			System.out.println("Name:"+file.getName());
			System.out.println("path:"+file.getAbsolutePath());
			if(file.canRead())
			{
				System.out.println("file is readable");
			}
			else {
				System.out.println("file is not readable");
			}ss
			if(file.canWrite()) {
				System.out.println("file is writable");
			}
			else {
				System.out.println("file is not writable");
			}
			if(file.canExecute()) {
				System.out.println("file is executable");
			}
			else {
				System.out.println("file is not executable");
			}
			System.out.println("length:"+file.length());
			
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
