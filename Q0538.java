package bolum05.questions;

import java.util.Scanner;

public class Q0538 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a binary integer:");
		int number = user.nextInt();
		String binary = "" + number;
		int decimal =0;
		String octal = "";
		int pow =0;
		while (number > 0) {
			decimal += (number % 10) * Math.pow(2, pow) ;
			number /= 10;
			pow++;
		}
		number = decimal;
		while(number > 0){
			octal = number % 8 + octal;
			number /= 8;
		}
		System.out.println("Binary : " + binary);
		System.out.println("Decimal : " + decimal);
		System.out.println("Octal : " + octal);
	}

}
