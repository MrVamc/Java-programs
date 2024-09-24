package myPrograms;

import java.util.Scanner;

public class Fibonacci_series {
	
	public static int result;
	
	public static void mySeries(int firstNumber, int secondNumber, int len) {
		
		for(int i = 1 ; i< len ; i++) {
			result = firstNumber + secondNumber;
			System.out.print(" "+ result);
			firstNumber = secondNumber;
			secondNumber = result;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		System.out.print("Enter value for length of fibonacci series : ");
		int series_length = sc.nextInt();
		System.out.print("My fibonacci series : ");
		System.out.print(a);
		System.out.print(" "+b);
		mySeries(b, b, series_length);
		
	}

}
