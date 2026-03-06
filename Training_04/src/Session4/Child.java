package Session4;

public class Child extends Parent {
	
	private int no;
	
	public Child() {
		System.out.println("In default constructor of child");
	}
	
	public Child (int no) {
		super (100);
		System.out.println("In param Constructor of Child");
		this.no = no;
	}
	public static void main(String[] args) {
		Child c = new Child(10);
//		System.out.println(c.no);
//		System.out.println("No:"+c.getno());
		System.out.println(c);
	}
}
