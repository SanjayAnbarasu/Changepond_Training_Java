package Session_6;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
//		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("10");
		h.add(null);
		System.out.println(h);
		System.out.println(h.add("E"));
		System.out.println(h);
	}
}
