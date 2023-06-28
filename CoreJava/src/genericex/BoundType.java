package genericex;

class A {
	void getDisplay() {
		System.out.println("This is class A");
	}
}

class B extends A {
	void getDisplay() {
		System.out.println("This is class B");
	}
}

class C<T extends A>{
	T a;
	C(T a){
		this.a=a;
	}
	void display() {
		a.getDisplay();
	}
}

public class BoundType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
            C<B> c1 =new C<B>(b1);
            c1.display();
	}

}
