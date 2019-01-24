package bolum05.questions;

import java.util.Scanner;

public class Q0546 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.printf("Enter a string : ");
		String s = user.nextLine();
		String reverse="";
		for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;
		}
		System.out.println("The reversed string is "+reverse);
	}

}
