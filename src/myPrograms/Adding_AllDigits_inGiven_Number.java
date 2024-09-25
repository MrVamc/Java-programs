package myPrograms;

import java.util.Scanner;

public class Adding_AllDigits_inGiven_Number {
	
		public static int sumAllDigits(int num) {
			
		int sum = 0;
		while(num > 0) {
			int remainder = num%10;
			sum = sum + remainder;
			num = num/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide any number more than unit : ");
		int num = sc.nextInt();
		System.out.println("Sum of all digits in " + num + " is : "+ sumAllDigits(num));
	}

}
