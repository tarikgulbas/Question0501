package bolum05.questions;

import java.util.Scanner;

public class Q0532 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		int firstDigit = (int)(Math.random()*10);
		int secondDigit ;
		do{
			secondDigit = (int)(Math.random()*10);
		}
		while(secondDigit == firstDigit);
		
		String lottery = "" + firstDigit + secondDigit;
		
		System.out.print("Enter your lottery pick (two digits) : ");
		String number =  user.nextLine();
		System.out.println("The lottery number is " + lottery);
		if(lottery.equals(number))
			System.out.println("Exact match: you win $10,000");
		else if(number.contains(""+firstDigit) && number.contains(""+secondDigit))
			 System.out.println("Match one digit: you win $3,000");
		else if(number.contains(""+firstDigit) || number.contains(""+secondDigit))
			 System.out.println("Match one digit: you win $1,000");
		else
		      System.out.println("Sorry, no match"); 
	}


}
