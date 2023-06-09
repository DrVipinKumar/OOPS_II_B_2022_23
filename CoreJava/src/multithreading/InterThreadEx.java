package multithreading;

class Shared {
	int items=0;
	boolean check=false;
	synchronized void getItems() {
		if(!check) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumer:"+this.items);
		check=false;
		notify();
		
	}
	void setItems(int num) {
		synchronized(this) {
			if (check) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		this.items=num;		
		System.out.println("Producer:"+this.items);
		check=true;
		notify();
		}
		
	}
}
class Consumer extends Thread {
	Shared s;
	Consumer(Shared s){
		this.s=s;
	}
	public  void run () {
		for (int i=0;i<6;i++) {
			s.getItems();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Producer extends Thread {
	Shared s;
	Producer(Shared s){
		this.s=s;
	}
	public void run () {
		for (int i=1;i<=6;i++) {
			s.setItems(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s =new Shared();
		Consumer c1=new Consumer(s);
		c1.start();
		Producer p1=new Producer(s);
		p1.start();

	}

}
