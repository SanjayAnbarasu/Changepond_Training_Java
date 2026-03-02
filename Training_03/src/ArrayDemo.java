import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
//		int a[] = {1,2,3,4,5,6};
		
//		 for (int i=0;i<a.length;i++) {
//			 System.out.println(a[i]);
//		 }
		
		System.out.println("Enter " +size+ "Array Elements:");
		for (int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		
		 System.out.println("Array Elements are as follows:");
		 for (int i:a) {
			 System.out.println(i);
			 
	}
	}
}
