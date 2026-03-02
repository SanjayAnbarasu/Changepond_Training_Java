package Required;
import java.util.Scanner;
public class Employee {
	private int EmpId;
	private  String empname;
	private float empsalary;
	
	public void initDate() {}
	
	public Employee() {
		System.out.println("Default constructor invoked");
		EmpId  =111;
		empname = "Rahul";
		empsalary = 12312.321f;
	}
	
	public Employee (int id,String name,float sal) {
		System.out.println("Default constructor invoked");
		EmpId  =id;
		empname = name;
		empsalary = sal;
	}
// toString()	 - object Class - String representation of an object 
	//Default constructor
	public String toString(){
		return   "Employee - [id-"+EmpId+" name-"+empname+" salary-"+empsalary+"]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter you name");
		String name = sc.next();
		System.out.println("ENter your salary");
		float sal  = sc.nextFloat();
		sc.close();
		
		Employee e = new Employee(id,name,sal);
		System.out.println(e);
		}
}

