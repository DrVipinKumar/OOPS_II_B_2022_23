package innerclass;
class Outer {
	void display() {
		System.out.println("Outer Class");
		class Local
		{
			void message() {
				System.out.println("Local Class");
			}
		}
		Local l =new Local();
		l.message();
}
		class Inner {
		void display() {
			System.out.println("Inner Class");
		}
	}
	static class Inner1 {
		void display() {
			System.out.println("Inner1 Class");
		}
	}
}

public class InnerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer o1 =new Outer();
			o1.display();
			Outer.Inner in1 =o1.new Inner();  //inner class
			in1.display();
			Outer.Inner1 in2 =new Outer.Inner1(); //nested class
			in2.display();
			
			
	}

}
