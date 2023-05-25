package javaioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fr=null;
	      int ch;
	    try {
				fr =new FileInputStream("src/Addition.java");
				try {
					while((ch=fr.read())!=-1) {
						System.out.print((char)ch);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
}
