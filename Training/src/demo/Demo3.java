package demo;

public class Demo3 {
	private static int dd,mm,yy; //instance variable 
	
	//member_function
	public void init_Date()
	{
		dd=mm=yy=1;
	}
	
	public void set_date(int d,int m,int y) //local variable
	{
		dd = d;
		mm = m;
		yy =y;
	}
	
	public void display_date()
	{
		System.out.println("date = " + dd + "/" + mm + "/" + yy);
	}
	public static void main(String[] args) {
		Demo3 d; //reference (local) variable
		d = new Demo3();// object creation - new keyword
		d.init_Date();
		d.set_date(27,2,2026);
		d.display_date();
		
	}
}
