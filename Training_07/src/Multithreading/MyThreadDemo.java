package Multithreading;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThreadDemo extends Thread  {
	static ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<Integer, String>();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		e.printStackTrace();
		
		}
		System.out.println("Child Thread Updatig Map");
		m.put(103,"C");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		m.put(101,"A");
		m.put(102,"B");
		
		
		MyThread t1=new MyThread();
		t1.start();
		Set s =m.keySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			Integer il =(Integer) itr.next();
			System.out.println("Main Iteratring and Current Entry: "+il+"---------"+m.get(il));
			Thread.sleep(3000);
			
		}
		System.out.println(m);
		
		
	}
	

}
