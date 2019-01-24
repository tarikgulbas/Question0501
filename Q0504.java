package bolum05.questions;

public class Q0504 {

	public static void main(String[] args) {
		final double MILE_TO_KILOMETERS = 1.609;
		System.out.println("Miles	Kilometers");
		for (int i = 1; i <= 10; i =i+1) {
			System.out.printf("%-4d	%5.3f\n",i,MILE_TO_KILOMETERS * i);
			
		}
	}
		
	}


