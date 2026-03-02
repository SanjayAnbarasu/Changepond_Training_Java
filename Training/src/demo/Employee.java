package demo;
import java.util.Scanner;

public class Employee {
	private String empName;
	
	public void setEmpName(String Name)
	{
		if(Name.length()>10)
			empName = Name.substring(0,10);
		else
			empName = Name;
	}
	public String getEmpName()
	{
		return empName;
	}
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter name: ");
		String name = s.next();
		e.setEmpName(name);
		System.out.println("Name:" + e.getEmpName());
		s.close();
		
	}

}
