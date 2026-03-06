package Multithreading;


public class MyThread extends Thread implements Runnable {

	
	public void run() {
		//resource
		System.out.println(Thread.currentThread()
				.getName()+ "-"+Thread.currentThread()
				.getId());//running
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();//Born
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.setName("One");
		t2.setName("two");
		t3.setName("three");
		t1.start();//runanble
		t2.start();
		t3.start();
		}

	
}
