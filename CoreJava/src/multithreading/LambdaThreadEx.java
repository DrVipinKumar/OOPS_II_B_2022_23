package multithreading;

public class LambdaThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread");
			}
			
		}).start();
	   new Thread(()->System.out.println("Thread")).start();
	  

	}

}
