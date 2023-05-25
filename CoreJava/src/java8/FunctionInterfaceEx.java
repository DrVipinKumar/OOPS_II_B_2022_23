package java8;

@FunctionalInterface
interface Multiply {
	String mul(int n1, int n2);
	
	
}

public class FunctionInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Multiply m1 = (int n1, int n2)->"MUl="+(n1*n2);
    		
            //lambda expression     
           System.out.println(m1.mul(45,67));
           
}
}
