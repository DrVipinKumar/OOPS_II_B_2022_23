package polymorphism;

class A {
	final int num=1;

	void display() {
		System.out.println("In class A");
	}
	void displayB() {
		System.out.println("In class A");
	}
}

class B extends A {
	void displayB() {
		
		System.out.println("In class B");
	}
	
}
public class PolyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//    B a1 =new A();    //down casting
		A a1 =new B();   //up casting
		a1.display();
		a1.displayB();
//		new A().display();  //anonymous object
//		new A() {  //anonymous class
//			void displayB() {
//				System.out.println("In class B");
//			}
//		}.display();

	}

}
