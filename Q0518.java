package bolum05.questions;

import java.util.Scanner;

public class Q0518 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a  nuumber between 1 and 9 : ");
		int number = user.nextInt();
		
		
		
		
		
		
		
		//Pattern A
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2d",j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		//Pattern B
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number -i +1; j++) {
				System.out.printf("%2d",j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		//Pattern C
		for (int i = 1; i <= number; i++) {
			for (int j = number; j > i; j--) {
				System.out.printf("%2s"," ");
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%2d",j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		//Pattern D
		//Pattern A
				for (int i = 0; i < number; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.printf("%2s"," ");
					}
					for (int j = 1; j <= number - i; j++) {
						System.out.printf("%2d",j);
					}
					System.out.println();
				}
	}

}
