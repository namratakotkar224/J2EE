package com.jspiders.serializationanddeserialization.deserialization;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import com.jspiders.serializationanddeserialization.object.User;
public class Deserial {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("nam.txt");
		if(file.exists()){
			FileInputStream fileinputstream=new FileInputStream(file);
			ObjectInputStream objectinputstream=new ObjectInputStream(fileinputstream);
			User user=(User)objectinputstream.readObject();
			System.out.println(user);
			System.out.println("object is read from the file");
			
			objectinputstream.close();
			fileinputstream.close();
		}
		else {
			System.out.println("file does not exist.");
		}
	}

}
