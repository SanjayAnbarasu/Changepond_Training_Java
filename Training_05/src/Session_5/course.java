package Session_5;

public class course implements Cloneable {
	String s1;
	String s2;
	String s3;
	
	
	public course() {}
	
	public course(String s1,String s2,String s3) {
		
	}

	@Override
	public String toString() {
		return s1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}		
}
