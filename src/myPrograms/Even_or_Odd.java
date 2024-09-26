package myPrograms;

import java.util.Scanner;

public class Even_or_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate your number here :");
		int number = sc.nextInt();
		String result = number % 2 == 0 ? "Even Number" : "Odd Number";
		System.out.println(result);
	}

}
