package Session_6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Rahul",100);
		h.put("Priyanka",700);
		h.put("Nikita",500);
		
		System.out.println(h);
		
		System.out.println(h.put("virat" , 18000));
		
		h.put("sayelee", 400);
		System.out.println(h);
		
		
		
		Set<String> s = h.keySet();
		System.out.println(s);
		
		
		Collection<Integer> c = h.values();
		System.out.println(c);
		
		Set s1 = h.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Integer>m =(Map.Entry<String,Integer>) itr.next();
			System.err.println(m.getKey()+ " "+m.getValue());
			if(m.getKey().equals("Nikita"))
				m.setValue(2000);
		}
		System.out.println(h);
		
	}
}
