//instance and static blocks
class Msg{
	{//instance block
		System.out.println("In Instance Block of Message class");
	}
	static {//static block
		System.out.println("In Static Block of Message class");
	}
	
	Msg(){
		System.out.println("Message class");
	}
	
}
public class BlocksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Msg m1= new Msg();
         Msg m2= new Msg();
         Msg m3= new Msg();
          
	}

}
