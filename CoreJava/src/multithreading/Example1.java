package multithreading;
class ThreadB implements Runnable {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+
					" Priority="+Thread.currentThread().getPriority());
			
		}
	}
}

class ThreadA extends Thread {
	ThreadA(String name){
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+
					" Priority="+Thread.currentThread().getPriority());
			
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		ThreadA t1 =new ThreadA("Thread A");
		t1.setPriority(10);
		t1.start();
		ThreadB r1 =new ThreadB();
		Thread t2 =new Thread(r1,"Thread B");
		t2.setDaemon(true);
		System.out.println(t2.getThreadGroup());
		t2.start();
		
	}

}
