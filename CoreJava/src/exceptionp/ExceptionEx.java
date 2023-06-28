package exceptionp;
import java.util.*;
//exception propagation
//Exception is an abnormal condition in program that stop
 // normal flow of execution of a program.
// Types of exception in Java: 
// 1. Checked Exception => Compile Time Exception, syntax error
// 2. Unchecked Exception => Runtime Time Exception
// Exception Handling: 
                  // Process to overcome exception is called Exception Handling
// try/catch
public class ExceptionEx {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,div;
		int data []= {1,2,3};
		System.out.println("Enter number 1");
		a=in.nextInt();
		System.out.println("Enter number 2");
		b=in.nextInt();
		try {
		div=a/b;
		System.out.println("Division="+div);
		System.out.println("Value of array="+data[5]);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Exception!");
		}
		System.out.println("After Exception!");
		

}
}
