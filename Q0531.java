package bolum05.questions;

import java.util.Scanner;

public class Q0531 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount : ");
		double amount = user.nextDouble();
		System.out.print("Enter annual percentage yield :");
		double monthlyInterestRate = user.nextDouble()/1200;
		System.out.print("Enter maturity period (number of months) :");
		int month = user.nextInt();
		
		double sum = amount;
			System.out.println("Month       CD Value");
		for (int i = 1; i <= month; i++) {
			sum = sum + sum * ( monthlyInterestRate);
			System.out.printf("%2d          $ %,.2f\n",i,sum);
		}
		
	}
}