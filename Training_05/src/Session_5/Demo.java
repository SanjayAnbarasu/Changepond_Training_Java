package Session_5;

public class Demo {
	public static void getmessage() {
		msg();
	}
public static void msg() {
	try {
		int no =10/0;
		System.out.println("NO :" + " "+no);
	}catch (Exception e) {
		System.out.println("Exception occcoured");
		}
	System.out.println("Done!!");
}

public static void main(String[] args) {
	Demo.getmessage();
	System.out.println("Finish");
}
}