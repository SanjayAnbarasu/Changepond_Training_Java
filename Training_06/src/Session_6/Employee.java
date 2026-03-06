package Session_6;

import java.util.TreeSet;

public class Employee implements Comparable {
	int empid;
	String empName;
	
	public Employee() {}
	
	public Employee(int empid, String empName) {
		this.empid = empid;
		this.empName = empName;
	}
		
			
			@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}

			public int compareTo(Object o) {
				
				int id1 = this.empid;
				Employee e = (Employee)o;
				int id2 = e.empid;
				
				if(id1<id2)
					return -1;
				else if(id1>id2)
					return +1;
				else
					return 0;
			}
			
			public static void main(String [] args) {
				
				Employee e1 = new Employee(1,"Syed");
				Employee e2 = new Employee(1,"Sanjay");
				Employee e3 = new Employee(1,"Thiru");
				Employee e4 = new Employee(1,"Christo");
				Employee e5 = new Employee(1,"Abi");
				Employee e6 = new Employee(1,"Aadil");
				
				
				TreeSet<Employee> t = new TreeSet<Employee>(new Mycomp());
				t.add(e1);
				t.add(e2);
				t.add(e3);
				t.add(e4);
				t.add(e5);
				t.add(e6);
				
				System.out.println(t);
			}
}