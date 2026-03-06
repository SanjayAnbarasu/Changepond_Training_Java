package Session4;

public class Teacher extends person{
	private String subject;
	
	public Teacher() {}
	
	public Teacher (String fnm,String lnm,int age,String subject) {
		super(fnm,lnm,age);
		this.subject = subject;
	}
}
