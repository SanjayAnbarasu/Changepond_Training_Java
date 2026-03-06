package Session_6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String> ();
		l.add("Rojar");
		l.add("Sanjay");
		l.add("Rahul");
		
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.equals("Rahul")) {
				itr.set("Syed");
			}
			if(s.equals("Syed")) {
				itr.set("Sanjay");
			}
		}
		while(itr.hasPrevious()) {
			String s = itr.previous();
			if(s.equals("Rojar")) {
				itr.remove();
			}
		}
		System.out.println(l);
	}
}
