package DSA;

import java.util.Scanner;

public class reverse_Integer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate your number here : ");
		int number = sc.nextInt();
		System.out.println(reverseInteger(number));
	}
	
	public static int reverseInteger(int x) {
		long out = 0;
		while(x != 0) {
			out = out * 10 + x % 10;
			x = x / 10;
		}
		
		if(out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) return 0;
		
		return (int) out;
	}

}
