package session7;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {
	public static void main(String[] args) {
		String s[] = {"A","B","C"};
		List<String> l = Arrays.asList(s);
		System.out.println(l);
		s[0] = "K";		
		l.set(1,"C");
		System.out.println(l);
		
//		l.add(0,"SA"); //unsupportedOperation
//		System.out.println(l);
		
//		l.remove(0);//unsupported operation
//		l.set(0,new Integer(10));java.lang.ArrayStoreException
//		System.out.println(l);
		
	}
}
