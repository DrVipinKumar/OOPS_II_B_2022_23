package javaioex;
import java.io.*;
public class CopyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileWriter fw=null;
		int ch;
       try {
		fr =new FileReader("src/17.jpg");
		fw =new FileWriter("src/18.jpg");
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
