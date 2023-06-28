class MDisplay{
	void displayMessage() {
		System.out.println("Welcome to Java");
	}
}
public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MDisplay msg1;  //Object Declaration;
		  msg1=new MDisplay(); //Object Instantiation
		  msg1.displayMessage();
		  MDisplay msg2=new MDisplay();
		  msg2.displayMessage();
		  System.out.println(msg2);
		  new MDisplay().displayMessage();
		  
		  

	}

}
