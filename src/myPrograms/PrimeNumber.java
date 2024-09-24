package myPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean result;
	public static boolean myPrime(int prime) {
		
		int count = 0;
		
		for(int i = 1; i<=prime; i++) {
			if(prime % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			result = true;
			count = 0;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Validate your prime number here : ");
		int num = sc.nextInt();
		
		if(myPrime(num) == true) {
			System.out.println("Given number is Prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
	}

}
