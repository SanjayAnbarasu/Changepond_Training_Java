package Session_6;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		System.out.println("Stack Demo");
		
		Stack<String> s = new Stack<String>();
		System.out.println(s.empty());
		s.push("A 1");
		s.push("B 2");
		s.push("C 3");
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search("A 1"));
		System.out.println(s.search("B 2"));
		System.out.println(s.search("C 3"));
	}
}
