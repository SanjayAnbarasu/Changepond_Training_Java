package Multithreading;

public class YieldDemo implements Runnable {
	public void run() {
		for(int i=1;i<=4;i++) {
			if(i==2) {
				Thread.yield();
			}
			else
			{
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new YieldDemo());
		Thread t2 = new Thread(new YieldDemo());
		Thread t3 = new Thread(new YieldDemo());
		t1.start();
		t2.start();
		t3.start();
	}
}
