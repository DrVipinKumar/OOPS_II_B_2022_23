package interfaces;
interface Sum{
	void add(int num1, int num2);//public abstract
	void display();
	double PI=3.14;  //public, static, final
}
interface Sub extends Sum{
	void Subtract(int num1, int num2);
}
class SumImp implements Sub, Sum{

	@Override
	public void add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Sum="+(num1+num2));
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}
	
}
//@FunctionalInterface
//interface Mul {
//	int multiply(int a, int b);
//}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Mul m1 =(a,b)->  a*b;
//		System.out.println(m1.multiply(23, 45));
		System.out.println(Sum.PI);
          SumImp s1=new SumImp();
          s1.add(12,34);
          Sum s2=new SumImp();
          s2.add(23,56);
          Sum s3 =new Sum() {

			@Override
			public void add(int num1, int num2) {
				// TODO Auto-generated method stub
				System.out.println("Sum="+(num1+num2));
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
        	  
          };
          s3.add(27,56);
	}
	
}
