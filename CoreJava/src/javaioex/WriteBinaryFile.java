package javaioex;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fw=null;
		String data="This is data for writing in java.txt file";
         try {
			fw =new FileOutputStream("src/Java.txt");
			fw.write(data.getBytes());
			System.out.println("File created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

