package com.jspiders.serializationanddeserialization.serialization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.jspiders.serializationanddeserialization.object.User;
public class Serial {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("nam.txt");
		if(file.exists()) {
			System.out.println("file already exists");
			FileOutputStream fileoutputstream=new FileOutputStream(file);
			ObjectOutputStream objectoutputstream=new ObjectOutputStream(fileoutputstream);
			objectoutputstream.writeObject(new User(1,"Research","ramesh@gmail.com","Ramesh@123"));
			System.out.println("object is written to the file");
			objectoutputstream.close();
			fileoutputstream.close();
			
		}
		else {
			file.createNewFile();
			System.out.println("file is created");
			FileOutputStream fileoutputstream=new FileOutputStream(file);
			ObjectOutputStream objectoutputstream=new ObjectOutputStream(fileoutputstream);
			objectoutputstream.writeObject(new User(1,"Research","ramesh@gmail.com","Ramesh@123"));
			System.out.println("object is written to the file");
			objectoutputstream.close();
			fileoutputstream.close();
		}

	}

}
