package Session_6;


import java.io.Serializable;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		System.out.println(l instanceof RandomAccess);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		
//		l.add("Rahul");
		l.add(30);
//		l.add("Thiyagu");
		l.add(30);
		l.add(32);
		l.add(33);
		
		
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			if((i%2) ==0)
				System.out.println(i);
			else
				itr.remove();
		}
		System.out.println("------");
		System.out.println(l);
//		 for (Object i:l) {
//			 System.out.println(i);
//		 }
//		 
//		 l.set(3, 40);
//		 System.out.println(l);
//		 
//		 l.addFirst(20);
//		 System.out.println(l);
//		 
//		 l.addLast("sanjay");
//		 System.out.println(l);
	}
}
