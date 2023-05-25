import java.util.*;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		Scanner kbchar=new Scanner(System.in);
		System.out.println("Enter number 1=");
		int num1=kb.nextInt();
		System.out.println("Enter name=");
		String name=kbchar.nextLine();
		System.out.println("Enter number 2=");
		int num2=kb.nextInt();
		int s=num1+num2;
		System.out.println("Sum="+s);
	}
}
