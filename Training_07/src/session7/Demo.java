package session7;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		
//		System.out.println(l.add(new Integer(10)));
//		l.add(null);
		
		System.out.println("Before Sorting" +l);
		Collections.sort(l,new MyComparator());
		System.out.println("After Sorting" +l);
		
	}
}
