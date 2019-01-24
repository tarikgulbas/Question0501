package bolum05.questions;

import java.util.Scanner;

public class Q0549 {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String s = user.nextLine().toLowerCase();
		int counterV = 0;
		int counterC = 0;
		for (int i = 0; i < s.length(); i++) {
			char k = s.charAt(i);
			if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u')
				counterV++;
			else if ('a' <= k && k <= 'z') {
				counterC++;
			}
		}
		System.out.println("The number of vowels is " + counterV);
		System.out.println("The number of consonants is " + counterC);
	}

}
