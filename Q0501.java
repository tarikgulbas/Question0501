package bolum05.questions;

import java.util.Scanner;

public class Q0501 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0 : ");
		int input = user.nextInt();
		int countPoz =0;
		int countNeg = 0;
		int sum=0;
		while(input !=0){
			if(input>0){
				countPoz++;
			}else{
				countNeg++;
			}
			sum += input;
			input= user.nextInt();
		}
		System.out.println("The number of positives is " + countPoz);
		System.out.println("The number of positives is " + countNeg);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + (sum *1.0 / (countNeg+countPoz)));
	}

}
