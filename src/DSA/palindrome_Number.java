package DSA;

import java.util.*;
public class palindrome_Number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate your number here : ");
		int number = sc.nextInt();
		
		if(number != palindromeNum(number) || number < 0) 
			System.out.println("Given number is not palindrome : "+ palindromeNum(number));
		
		else
			System.out.println("Given number is a palindrome : "+ palindromeNum(number));
		
	}
	
	public static int palindromeNum(int x) {
		long sum = 0;
		while(x != 0) {
			sum = sum * 10 + x % 10;
			x = x / 10;
		}
		
		return (int) sum;
	}

}
