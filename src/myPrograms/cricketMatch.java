package myPrograms;

import java.util.Scanner;

public class cricketMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total overs: ");
		int overs = sc.nextInt();
		System.out.print("Enter runrate: ");
		double runrate = sc.nextDouble();
		
		double totalruns = overs * runrate;
		System.out.println("Total runs scored by the Batting team is "+totalruns +" with run rate of "+ runrate);
	}
}
