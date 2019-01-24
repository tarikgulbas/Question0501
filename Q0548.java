package bolum05.questions;

import java.util.Scanner;

public class Q0548 {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String s = user.nextLine();
		String oddChars = "";
		
		for (int i = 0; i < s.length(); i = i + 2) {
			oddChars += s.charAt(i);
		}
		
		System.out.println(oddChars);
	}

}
