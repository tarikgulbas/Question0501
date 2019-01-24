package bolum05.questions;

import java.util.Scanner;

public class Q0550 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = user.nextLine();
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				counter++;
			}
		}
		System.out.println("The number of uppercase letters is " + counter);
	}

}
