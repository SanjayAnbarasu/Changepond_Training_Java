package Session4;

public class Parent {
	private int no;
	
	public Parent() {
		System.out.println("in default constructor of the parent");
		no =100;
	}
	public Parent (int no) {
		System.out.println("In param constructor of parent");
		this.no = no;
	}
	public int getno() {
		return no;
	}
}
