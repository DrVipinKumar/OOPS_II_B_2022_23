package genericex;
class Calc2 {
	<T,K>void getSum(T num1, K num2) {
		if (num1 instanceof Number && num2 instanceof Number) {
			System.out.println(""
					+ "Sum ="+(Double.parseDouble(num1.toString())+
							Double.parseDouble(num2.toString())));
		} else {
			System.out.println(""
					+ "Concatination ="+num1.toString()+num2.toString());
		}
		
	}
}
class Calc<T,K> {
	T num1; 
	K num2;
	Calc(T num1, K num2){
		this.num1=num1;
		this.num2=num2;
	}
	void getSum() {
		if (num1 instanceof Number && num2 instanceof Number) {
			System.out.println(""
					+ "Sum ="+(Double.parseDouble(num1.toString())+
							Double.parseDouble(num2.toString())));
		} else {
			System.out.println(""
					+ "Concatination ="+num1.toString()+num2.toString());
		}
		
	}
}

public class GenericCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Calc2 c =new Calc2();
            c.<Float, Float>getSum(12.34f,23.45f);
            Calc<Float,Integer> c1 =new Calc<Float,Integer>(12.45f,34);
            c1.getSum();
            Calc<String,String> c2 =new Calc<>("KIET","MCA");
            c2.getSum();
           
	}

}
