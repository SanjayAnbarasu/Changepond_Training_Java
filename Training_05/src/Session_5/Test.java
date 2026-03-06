package Session_5;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		double d = a.div(5, 2);
		if (d<1) {
			try {
				throw new Myexception();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("D = "+d);
	}
}
