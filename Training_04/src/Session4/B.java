package Session4;

public class B extends A {
	public void m1() {
		System.out.println("In m1 of A");
	}
	
	public void m2() {
		System.out.println("In m2 of A");
	}
	
	public static void main(String[] args) {
		B b =new B();
		b.m1();
		b.m2();
		
		//polymorphic reference = Dyanamic datatype
		//superclass reference = childclassObject;
		
		A a = new B();
//		B b = new A();
		
		a.m1();
		((B)a).m2(); //downcasting the reference from super to sub class - CTE
		//if you want to call subclass specific method (ploymorph ref)
		//you need to downcast the reference from super to sub
	}
}
