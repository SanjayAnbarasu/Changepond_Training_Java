package Required;

public class Student {
	
	private int rollno;
	private String name;
	public static int count;
	
	public Student(int rollno, String name)
		{
		this.rollno = rollno;
		this.name = name;
		count++;
		}
	
	public static void getStudentcount()
	{
		System.out.println("count" +count);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	static {
		System.out.println("Static Block called");
		count = 0;
	}
	
	public static void main(String[] args) {
		System.out.println("In main Method");
		Student s1  = new Student (1,"sanjay");
		Student s2  = new Student (2,"syed");
		Student.getStudentcount( );
		System.out.println(s1);
		System.out.println(s2);
	}
}
