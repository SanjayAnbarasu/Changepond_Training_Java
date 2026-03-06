package Session_6;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		System.out.println("a".compareTo("A"));//32
		System.out.println("Z".compareTo("z"));//-32
		System.out.println("A".compareTo("A"));//0
//		System.out.println("A".compareTo(null));
		
		
		
		//obj1.compareto(obj2)
		//-ive obj come before obj2
		//live obj1 come after obj2
		//0 obj1 and obj 2 are equal
		
		
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
//		t.add("sanjay");
		System.out.println(t);
		
		
	}
}
