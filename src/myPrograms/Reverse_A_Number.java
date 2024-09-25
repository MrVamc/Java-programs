package myPrograms;

import java.util.Scanner;

public class Reverse_A_Number {
	
	public static int reverseNumber(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a number : ");
		int num = sc.nextInt();
		System.out.println("Reverse order of given "+ num + " is : "+ reverseNumber(num));
	}

}
