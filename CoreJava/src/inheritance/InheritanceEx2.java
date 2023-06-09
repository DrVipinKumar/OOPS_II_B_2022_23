package inheritance;
//IS-A relationship between two class
class A {
	String msg;
	
	A(String msg){
		this.msg=msg;
	}
	
	void display() {
		System.out.println("A="+msg);
	}
	
	
}
class B extends A {
	B(){
		super("this is message");
	}
	B(String msg){
		super(msg);
	}
	void displayB() {
		System.out.println(super.msg);
	}
//	void display() {
//		System.out.println("B="+msg);
//	}
	void display(String msg1) {
		System.out.println("A Local="+msg1);
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           A a1 =new A("Message for A");
           a1.display();
          // a1.display("Message by A Block");
           B b1 =new B("Message for B");
           b1.display();
           b1.display("Message by B Block");
           b1.displayB();
	}

}
