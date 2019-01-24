package bolum05.questions;

import java.util.Scanner;

public class Q0525 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		double result = 0;
		for (int number = 10000; number <= 100000; number = number + 10000) {
			for (int i = 1; i <= number; i++) {
				result += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
			}
			System.out.printf("For i = %6d the sum is %f\n", number, result);
		}
	}
}
