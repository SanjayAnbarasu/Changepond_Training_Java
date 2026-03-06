package Session_5;

public class WrapperDemo {
	public static void main(String[] args) {
		int no =10;
		Integer i = new Integer(no);//primiotive to wrapper - boxing
		
		
		int a = i.intValue(); //Wrapper to primitive -unboxing
		
		//String to Primitive
		String str = "30";
		int b = Integer.parseInt(str);
		
		//string to object
		Integer c = Integer.valueOf(str);
		
		//autoboxing
		int t = 20;
		Integer s =t;
		
		//Autounboxing
		int y = s;
	}
}
