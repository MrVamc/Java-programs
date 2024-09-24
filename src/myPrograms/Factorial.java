package myPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for x: ");
		int x = sc.nextInt();
		int multiple = 1;
		if(x > 0) {
		for(int i = x; i>= 1; i--) {
			multiple = i * multiple;
		}
		System.out.println("Factorial of "+ x + " is : "+ multiple);
		
		}
		else {
			System.out.println("To find factorial the number should be greater than 0");
		}
	}
}
