package Strings;

import java.util.Scanner;

public class String_Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Validate your String : ");
		String original = sc.next();
		if(original.equalsIgnoreCase(myPalindrome(original))) {
			System.out.println("Given String is a Palindrome : "+ myPalindrome(original));
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
	}
	
	public static String myPalindrome(String str) {
		String reverse = "";
		for(int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

}
