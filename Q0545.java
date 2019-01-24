package bolum05.questions;

import java.util.Scanner;

public class Q0545 {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		final int n = 10;
		double sum = 0;
		double squareSum = 0;
		double mean;
		double std;

		System.out.print("Enter ten numbers : ");
		for (int i = 0; i < n; i++) {
			double number = user.nextDouble();
			sum += number;
			squareSum += number * number;
		}
		mean = sum / n;
		std = Math.sqrt((squareSum - (sum * sum / n)) / (n - 1));

		System.out.println("The mean is " + mean);
		System.out.printf("The standart deviation is %.5f", std);
	}

}
