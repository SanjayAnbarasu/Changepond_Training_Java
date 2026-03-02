package p1;

public final class A {
	protected int no;
	public static int count = 111;
	
	public A() {
		no =10;
	}
	
	public static int getcount() {
		return count;
	}
	protected void getno () {
		System.out.println("No = " +no);
	}
}
