package Session_5;

public class Student extends Object implements Cloneable {
	private int rn;
	private String nm;
	private course course;
	
	public Student () {
		
	}
	
	public Student (int rn,String nm ,course course) {
		super();
		this.rn = rn;
		this.nm = nm;
		this.course = course;
	}
	
	protected Object Clone() throws CloneNotSupportedException{
		Student student = (Student)super.clone();
		student.course = (course) course.clone();
		return student;
	}
	
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", nm=" + nm + ", course=" + course + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		course c = new course ("math" , "physics" , "Chemistry");
		Student s1 = new Student (1,"Rahul"  ,c);
		Student s2 =(Student) s1.clone();
		System.out.println("S1"+s1);
		System.out.println("S2"+s2);
		s1.course.s1 = "History";
		System.out.println(s2.course.s1);

	}
}
// this is shallow cloning