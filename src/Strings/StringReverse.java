package Strings;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a String : ");
		String text = sc.next();
		reverseString(text);
	}
	
	public static void reverseString(String str) {
		int len = str.length();
		String reverse = "";
		for(int i = len -1; i>=0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(str+ " => Reverse String : "+ reverse);
	}

}
