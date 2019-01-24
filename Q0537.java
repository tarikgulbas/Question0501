package bolum05.questions;

import java.util.Scanner;

public class Q0537 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a decimal integer:");
		int number = user.nextInt();
		String decimal = "" + number;
		String binary = "";
		while (number > 0) {
			binary = number % 2 + binary;
			number /= 2;
		}
		System.out.println("Decimal : " + decimal);
		System.out.println("Binary : " + binary);
	}

}
