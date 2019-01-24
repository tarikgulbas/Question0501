package bolum05.questions;

import java.util.Scanner;

public class Q0547 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string : ");
	
		String isbn =  user.nextLine();

		if (isbn.length() != 12) {
			System.out.println(isbn + " is an invalid input.");
		} else {
			int checksum = 0;

			for (int i = 0; i < isbn.length(); i++)
				checksum += (Integer.valueOf("" +isbn.charAt(i))) * (i % 2 == 1 ? 1 : 3);

			checksum = 10 - checksum % 10;

			System.out.println("The ISBN-13 number is " + isbn + (checksum == 10 ? 0 : checksum));
		}
	}
}
