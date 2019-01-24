package bolum05.questions;

import java.util.Scanner;

public class Q0514 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter two integers :");
		int n1 = user.nextInt();
		int n2 = user.nextInt();
		
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		int divisor =min;
		
		while (true){
			if(max % divisor == 0 && min %divisor == 0){
				System.out.printf("The greatest divisor of %d and %d is %d",n1,n2,divisor);
				break;
			}
			divisor--;
			
		}
		

		
		
	}

}
