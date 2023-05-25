package javaioex;
import java.io.*;
public class WriteCharFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		String data="This is data for writing in java.txt file";
         try {
			fw =new FileWriter("src/Java.txt");
			fw.write(data);
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
