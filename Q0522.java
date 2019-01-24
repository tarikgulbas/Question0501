package bolum05.questions;

import java.util.Scanner;

public class Q0522 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.print("Loan Amount : ");
		double balance = user.nextDouble();
		System.out.print("Number of Years : ");
		int numberOfYears = user.nextInt();
		System.out.print("Annual Interest Rate : ");
		double interestRate=user.nextDouble();
		
		double monthlyPayment = (balance * (interestRate / 1200))
				/ (1 - (1) / (Math.pow((1 + interestRate / 1200), numberOfYears * 12)));
		
		
		System.out.printf("\n%-20s%-20s%-20s%-20s\n", "Payment #", "Interest","Principal", "Balance");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest =  (Math.round((interestRate / 1200)* balance*100)/100.0);
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-20d", i);
			System.out.printf("%-20.2f", interest);
			System.out.printf("%-20.2f", principal);
			System.out.printf("%,-20.2f\n", balance);
		}
	}

}
