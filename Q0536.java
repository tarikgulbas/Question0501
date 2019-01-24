package bolum05.questions;

import java.util.Scanner;

public class Q0536 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		int number = user.nextInt();
		int temp = number;
		int sum = 0;
		for (int j = 0; j < 9; j++) {
			
			sum += (temp % ((int)Math.pow(10,1))) *(9-j);
			temp = (temp / ((int) Math.pow(10, 1 )));
			
		}
		if(sum %11 == 10){
			System.out.println("The ISBN-10 number is " + number + "X");
		}else{
			System.out.println("The ISBN-10 number is " + number + ""+ (sum%11));
		}
		
	}

}
