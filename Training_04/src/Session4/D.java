package Session4;

public class D extends C{
	public D m1() {
		return new D();
	}
	
	public void getMsg() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new D().m1().getMsg();
	}
}
