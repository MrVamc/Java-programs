package myPrograms;

import java.util.Scanner;

public class Ascii_values {
	
	// A to Z -> 65 to 90
	
	// a to z -> 97 to 122
			
	// 0 to 9 -> 48 to 57
	
	
	
	
	public static void AtoZ(int a, int b) {
		for(int i = a; i<=b; i++) {
			char ascii = (char) i;
			System.out.println(i + " ascii value is : "+ ascii);
		}
	}
	
	public static void atoz(int a, int b) {
		for(int i = a; i<=b; i++) {
			char ascii = (char) i;
			System.out.println(i+" ascii value is :"+ ascii);
		}
	}
	
	public static void oto9(int a, int b) {
		for(int i = a; i<=b; i++) {
			char ascii = (char) i;
			System.out.println(i+" ascii value is :"+ ascii);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter value for num2 : ");
		int num2 = sc.nextInt();
		
		AtoZ(num1, num2);
		
		//atoz(num1, num2);
		
		//oto9(num1, num2);
		
	}

}
