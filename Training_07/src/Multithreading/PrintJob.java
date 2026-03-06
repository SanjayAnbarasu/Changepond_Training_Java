package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable{

	
	private String name;
	 private PrintJob(String name) {
		 super();
		 this.name=name;
		 
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+".. job started by thread  "+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			// TODO: handle exception
		e.printStackTrace();
		}
		System.out.println(name+".. job started by thread  "+ Thread.currentThread().getName());
	}
	 
	 public static void main(String[] args) {
		PrintJob[]jobs = {
				new PrintJob("xyz"),
				new PrintJob("abc"),
				new PrintJob("efg"),
				new PrintJob("hig"),
				new PrintJob("klm"),
				new PrintJob("jpg")
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for (PrintJob j : jobs) {
			
			service.submit(j);
			
		}
		service.shutdown();
	}
	 
	 
}
