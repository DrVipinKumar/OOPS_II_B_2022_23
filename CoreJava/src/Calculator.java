//constructor, constructor or method overloading, local, instance and static variable
class Sum {
	private float num1;  //instance variable
	private float num2;
	static float PI=3.14f;  //class variable
	Sum(){
		this(0,0);
	}
	Sum(int num1, int num2){
		this((float)num1,(float)num2);		
	}
	Sum(float num1, float num2){
		this.num1=num1;
		this.num2=num2;
	}
   float getSum() {	  
		return num1+num2;
	}
  
   int getSum(int val1, int val2) {	  
		return val1+val2;
	}
  
}
public class Calculator {
	//Constructor is a special method that have same name as name of class
    //It use to initialize variable in class. 
    //It use to create object of a class.
    //It does not return any value. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("PI="+Sum.PI);
         Sum s1=new Sum();
         System.out.println("PI in S1="+s1.PI);
         s1.PI=10;         
         float add=s1.getSum(23,56);
         System.out.println("Sum ="+add);
         Sum s2=new Sum(56,78);
         System.out.println("PI in S2="+s2.PI);
         add=s2.getSum();
         System.out.println("Sum="+add);
         Sum s3=new Sum(56.56f,78.67f);
         add=s3.getSum();
         System.out.println("Sum="+add);
         
	}

}
