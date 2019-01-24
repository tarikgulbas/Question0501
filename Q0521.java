package bolum05.questions;

import java.util.Scanner;

public class Q0521 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.print("Loan Amount : ");
		double amount = user.nextDouble();
		System.out.print("Number of Years : ");
		int years = user.nextInt();
		System.out.printf("\n%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		for (double interestRate = 5; interestRate <= 8; interestRate = interestRate + 0.125) {
			double monthlyPayment = (amount * (interestRate / 1200))
					/ (1 - (1) / (Math.pow((1 + interestRate / 1200), years * 12)));
			System.out.printf("%-4.3f %%%13s", interestRate, " ");
			System.out.printf("%-20.2f", monthlyPayment);
			System.out.printf("%,-20.2f\n", monthlyPayment * 12 * years);
		}
	}
}
