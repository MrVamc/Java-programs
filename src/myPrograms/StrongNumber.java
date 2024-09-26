package myPrograms;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate your Strong number here : ");
		int num = sc.nextInt();
		int dublicate = num;
		int sum =0;
		while(num >0) {
			int rem = num % 10;
			int multiple = 1;
			for(int i = 1; i<=rem; i++) {
				multiple = multiple * i;
			}
			sum = sum + multiple;
			num = num/10;
		}
		if(sum == dublicate) {
			System.out.println("Given number "+ dublicate + " is a Strong Number : "+ sum);
		}
		else {
			System.out.println("Given number "+ dublicate + " is not a Strong Number : "+ sum);
		}
	}

}
