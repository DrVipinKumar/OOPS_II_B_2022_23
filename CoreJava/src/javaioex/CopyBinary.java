package javaioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fr=null;
		FileOutputStream fw=null;
		int ch;
       try {
		fr =new FileInputStream("src/17.jpg");
		fw =new FileOutputStream("src/18.jpg");
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		System.out.println("File copied!");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		fr.close();
		 fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}
	

}
