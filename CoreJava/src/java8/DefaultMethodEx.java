package java8;

interface Sum {
	void add(int n1, int n2);
	default void display() {
		System.out.println("this is default method");
		display1();
	}
	private void display1() {
		System.out.println("this is private method");
	}
	private static void display2() {
		System.out.println("this is private static method");
	}
	static void displayStatic() {
		System.out.println("this is static method");
		display2();
	}
	
}
public class DefaultMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1 =new Sum() {

			@Override
			public void add(int n1, int n2) {
				// TODO Auto-generated method stub
				System.out.println("Sum="+(n1+n2));
			}
			
		};
		s1.display();
		Sum.displayStatic();
       
	}

}
