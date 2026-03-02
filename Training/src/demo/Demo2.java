package demo;

public class Demo2 {
public static void main(String[] args) {
	byte b = 127;
	int a =12;
	
	b = (byte)a;
	System.out.println("value of b is " +b);
	
	a = b;
	
	int num1 =5;
	int num2 =2;
	
	float d = (float)num1/num2;
	System.out.println("the value of d :"+d);
	
	float f = 12.5f;
	int n = (int)f;
	System.out.println(n);
	
	
	//type promotion in java
	
	byte b1 = 10;
	byte b2 =20;
	int b3 = b1*b2;
	
	System.out.println("this is the value "+b3);
	
	
}
}
