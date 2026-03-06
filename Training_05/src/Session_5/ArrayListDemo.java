package Session_5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
//		l.add("A");
		l.add(20);
		l.add(null);
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.add(1,20);
		System.out.println(l);
		l.add(30);
		System.out.println(l);
		
		System.out.println("--->" +l.get(1));
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
	}
}

