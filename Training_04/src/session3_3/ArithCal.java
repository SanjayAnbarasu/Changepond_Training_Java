package session3_3;

public interface ArithCal {

	public static final int a=10;
	
	public int add(int a,int b);
	
	public abstract int sub(int a,int b);
	
	
	
	public default void print(Stirng txt) {
		System.out.println(txt);
	}
	
	public static void print(Stirng txt , String txt) {
		System.out.println(txt,txt);
	}
}
