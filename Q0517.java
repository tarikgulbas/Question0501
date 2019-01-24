package bolum05.questions;

import java.util.Scanner;

public class Q0517 {

	public static void main(String[] args) {
		Scanner user = new Scanner (System.in);
		
		System.out.print("Enter the number of lines (between 1 and 15) : ");
		int number = user.nextInt();
		
		for (int i = 0; i < number; i++) {
			for (int j = number-i; j > 1; j--) {
				System.out.printf("%3s"," ");
			}
			for (int j = i+1; j > 0; j--) {
				System.out.printf("%3d",j);
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d",j+1);
			}
			System.out.println();
		}
		
	}

}
