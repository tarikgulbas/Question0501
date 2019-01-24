package bolum05.questions;

import java.util.Scanner;

public class Q0516 {

	public static void main(String[] args) {
		Scanner user =new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int number = user.nextInt();
		int total=1;
		int divisor=1;
		int numberAfterDivision = number;
		while(total!=number){
			divisor++;
			if(numberAfterDivision%divisor==0){
				System.out.print(divisor +", ");
				total *=divisor;
				numberAfterDivision /= divisor;
				divisor =1;
			}
		}
	}

}
