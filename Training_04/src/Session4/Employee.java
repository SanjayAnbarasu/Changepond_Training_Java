package Session4;

public class Employee {
	 private int empid;
	 private String empname;
	 
	 
	 public Employee() {}
	 
	 public Employee(int empid  ,String empname) {
		 super();
		 this.empid = empid;
		 this.empname = empname;
	 }

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	 
	
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if((this.empid == e.empid) && (this.empname == e.empname))
			return true;
		else 
			return false;
	}
	 public static void main(String[] args) {
		Employee e1 = new Employee(1,"Rahul");
		Employee e2 = new Employee(1,"priyanka");
		
		if(e1.equals(e2))
			System.out.println("object are equal");
			else
			System.out.println("object are not equal");
		
		
		System.out.println(e1);
		System.out.println(e2);

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empid+1;
	}
}
