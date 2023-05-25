package javaioex;
//Stream: 
//	    Flow of character is called stream 
//Types of Stream: 
//	             1. Input Stream  -> reading of character/bytes
//	             2. Output Stream -> writing of character/bytes
//Types of Input Stream and Output Stream: 
//	                     1. Character Stream - 16 bit
//	                     2. Bytes Stream  - 8 bit binary
import java.io.*;
public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             float num1, num2, sum;
             //InputStreamReader in =new InputStreamReader(System.in);
             BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            try {
            	 System.out.println("Enter number 1");
				num1=Float.parseFloat(br.readLine());
				System.out.println("Enter number 2");
				num2=Float.parseFloat(br.readLine());
				sum=num1+num2;
				System.out.println("Sum="+sum);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
	}

}
