class Display{
	void displayMessage() {
		System.out.println("Welcome to Java");
	}
}
public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Display msg1;  //Object Declaration;
		  msg1=new Display(); //Object Instantiation
		  msg1.displayMessage();
		  Display msg2=new Display();
		  msg2.displayMessage();
		  System.out.println(msg2);
		  new Display().displayMessage();
		  
		  

	}

}
