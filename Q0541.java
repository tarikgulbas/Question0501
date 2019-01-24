package bolum05.questions;

import java.util.Scanner;

public class Q0541 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int number;
		int max=0;
		int maxCounter=0;
		System.out.print("Enter number : ");
		do{
			number = user.nextInt();
			if(number>max){
				max = number;
				maxCounter =1;
				
			}else if(number ==max)
				maxCounter++;
			
		}while(number!=0);
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence of the largest number is " + maxCounter);
	}

}
