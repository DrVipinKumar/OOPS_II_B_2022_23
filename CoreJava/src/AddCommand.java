class Add{
	static int getAdd(int num1, int num2) {
		return num1+num2;
	}
}
public class AddCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==2)
		{
       int num1=Integer.parseInt(args[0]);
       int num2=Integer.parseInt(args[1]);
       int s=Add.getAdd(num1, num2);
       System.out.println("Sum="+s);
       
		} else {
			 System.out.println("Please enter command line arguments");
		}
	}

}
