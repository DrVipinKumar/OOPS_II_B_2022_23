package javaioex;
import java.io.*;
public class ReadCharFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      File f =new File("src/Addition.java");
      FileReader fr=null;
      int ch;
      if (f.exists()) {
    	  try {
			fr =new FileReader(f);
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
      }}
    }
