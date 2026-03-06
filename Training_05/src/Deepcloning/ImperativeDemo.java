package Deepcloning;

import java.util.stream.IntStream;

public class ImperativeDemo {
	public static void main(String[] args) {
//		int sum = 0;
//		for(int i =0;i<=5;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		
		int sum =IntStream.of(1,2,3,4,5).sum();
		System.out.println("Sum = " +sum);
	}
}
