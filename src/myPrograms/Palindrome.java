package myPrograms;

import java.util.Scanner;

public class Palindrome {
	
	public static int myPalindrome(int number) {
		
		int sum = 0;
		int dublicate = number;
		while(dublicate > 0) {
			int rem = dublicate % 10;
			sum = sum * 10 + rem;
			dublicate = dublicate / 10;
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Verify your Palindrome number here, Please enter : ");
		int num = sc.nextInt();
		
		if(num == myPalindrome(num)) {
			System.out.println("Given number "+ num + " is palindrome :" + myPalindrome(num));
		}
		else {
			System.out.println("Given number "+ num + " is  not palindrome :" + myPalindrome(num));
		}
	}

}
