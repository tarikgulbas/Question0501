package bolum05.questions;

import java.util.Scanner;

public class Q0530 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter the amount (e.g., 100) you save monthly: ");
		double amount = user.nextDouble();
		System.out.print("Enter the annual interest rate (e.g., 5) :");
		double monthlyInterestRate = user.nextDouble()/1200;
		System.out.print("Enter the number of months :");
		int month = user.nextInt();
		
		double sum = 0;
		
		for (int i = 1; i <= month; i++) {
			sum = (sum + amount) * (1 + monthlyInterestRate);
		}
		System.out.printf("The value in the account becomes $ %,.3f after %d months.",sum,month);
		
	}

}
