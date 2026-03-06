package session7;

public class Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup());//java.lang.ThreadGroup[name=main,maxpri=10]
		System.out.println(Thread.currentThread().getThreadGroup()
				.getParent().getName());//system
		
//		ThreadGroup g1 = new ThreadGroup("FirstGroup");
//		System.out.println(g1.getName());
//		
//		ThreadGroup g2 = new ThreadGroup("SecondGroup");
//		System.out.println(g2.getName());
		
		ThreadGroup tg = new ThreadGroup("tg");
		Thread t1 = new Thread(tg , "First Thread");
		Thread t2 = new Thread(tg , "Second Thread");
		System.out.println(tg.getMaxPriority());//10
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		
		tg.setMaxPriority(3);
		Thread t3 = new Thread(tg , "Third Thread");
		System.out.println(tg.getMaxPriority());//3
		System.out.println(t3.getPriority());//3
		
		

	}
}
