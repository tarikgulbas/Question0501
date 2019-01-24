package bolum05.questions;

import java.util.Scanner;

public class Q0515 {

	public static void main(String[] args) {
		Scanner user =new Scanner(System.in);
		System.out.printf("%-7s", " ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%-7d",i);
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 3; i < 13; i++) {
			System.out.printf("%-7d",i);
			for (int j = 0; j < 11; j++) {
				System.out.printf("%-7s","" +((char)(i*10 + j)));
			}
			System.out.println();
		}
	}

}
