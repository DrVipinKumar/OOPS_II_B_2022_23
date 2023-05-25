package java8;
@FunctionalInterface
interface Calculator{
	int cal(int n1, int n2);
}
public class LambdaEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Calculator sum=(n1,n2)-> n1+n2;// (n1,n2)=>n1+n2
           Calculator sub=(n1,n2)-> n1-n2;// lambda n1,n2:n1+n2;
           Calculator mul=(n1,n2)-> n1*n2;
           Calculator div=(n1,n2)-> n1/n2;
           System.out.println("Sum="+sum.cal(50, 10));
           System.out.println("Sub="+sub.cal(50, 10));
           System.out.println("Multipy="+mul.cal(50, 10));
           System.out.println("Division="+div.cal(50, 10));
	}

}
