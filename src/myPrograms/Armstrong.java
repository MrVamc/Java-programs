package myPrograms;

import java.util.Scanner;

public class Armstrong {
	
	static int count = 0, sum = 0;
	
	public static int myArmstrong(int number) {
		
		int temp = number;
		
		while(number > 0) {
			number = number / 10;
			count++;
		}
		
		while(temp > 0) {
			int rem = temp % 10;
			int mul = 1;
			for(int i =1; i<= count; i++) {
				mul = mul * rem;
			}
			sum = sum + mul;
			temp = temp / 10;
		}
		
		
		
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate yout Armstrong number here : ");
		int num = sc.nextInt();
		
		if(num == myArmstrong(num)) {
			System.out.println("Given number which is "+ num + " is an Armstrong number : "+ myArmstrong(num));
		}else {
			System.out.println("Given number which is "+ num + " is not an Armstrong number : "+ myArmstrong(num));
		}
		
		
	}

}
