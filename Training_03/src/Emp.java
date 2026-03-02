public class Emp {
	private int EmpId;
	private  String empname;
	private Date Date_of_joining;
	
	public Emp() {
		
	}
	
	public Emp(int EmpId, String empname,Date Date_of_joining ) {
		this.EmpId = EmpId;
		this.empname = empname;
		this.Date_of_joining = Date_of_joining;
	}

	public String toString() {
		return "Emp [EmpId=" + EmpId + ", empname=" + empname + ", Date_of_joining=" + Date_of_joining + "]";
	}
	
	public static void main(String[] args) {
		Emp e =new Emp(2 , "Rahul" , new Date(22,02,2004));
				System.out.println(e);
	}
} 
