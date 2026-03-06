package Session_6;

import java.util.Hashtable;

public class HahTableDemo {
	public static void main(String[] args) {
		Hashtable<Temp, String> h = new Hashtable<Temp, String>();
		
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(3),"C");
		h.put(new Temp(1),"D");

		System.out.println(h);	
	}
}
