package Multithreading;

public class Demo1 {
	public static void main(String[] args) {
		
		ThreadGroup tg = Thread.currentThread()
				.getThreadGroup().getParent();
		
		System.out.println("-------------");
		
		Thread[] t = new Thread[10];
		tg.enumerate(t);
		for(Thread i:t) {
			System.out.println(i.getName());
		}
	}
}
