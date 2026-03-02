package demo;
import java.util.Scanner;

public class Demo4 {

    private int dd, mm, yy;

    // Setter and Getter for dd
//    public void setDd(int d) {
//        dd = d;
//    }
//
//    public int getDd() {
//        return dd;
//    }
    
    public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
    public static void main(String[] args) {
        // Create scanner to read from System.in
        Scanner sc = new Scanner(System.in);
        Demo4 d = new Demo4();
        
        System.out.print("Enter a day = ");
        
        // FIX: Use sc.nextInt() to capture the user's input
        int day = sc.nextInt(); 
        
        d.setDd(day);
        
        System.out.println("Day = " + d.getDd());
        
        int dd = d.getDd();
        System.out.println("Day " + dd);
        
        // Good practice: close the scanner when done
        sc.close();
    }
}
