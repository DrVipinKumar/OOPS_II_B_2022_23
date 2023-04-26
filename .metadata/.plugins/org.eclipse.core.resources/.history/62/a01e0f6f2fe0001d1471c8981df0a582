package abstraction;

abstract class Display{
	abstract void message();
	void printMessage() {
		System.out.println("This is normal method");
	}
}
class Message extends Display{

	@Override
	void message() {
		// TODO Auto-generated method stub
	   System.out.println("this is message child class");	
	}

	
	
}

public class AbstractClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Display d1 =new Message();
          d1.message();
	}

}
