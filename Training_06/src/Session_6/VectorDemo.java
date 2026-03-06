package Session_6;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		System.out.println(v.capacity());//10
		
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		v.addElement(10);
		System.out.println(v.capacity());//20
		System.out.println(v);
		
		Enumeration<E>
	}
}
