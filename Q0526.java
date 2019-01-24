package bolum05.questions;

public class Q0526 {

	public static void main(String[] args) {
		double result = 0;

		
		for (int number =10000; number <= 100000; number += 10000) {
			for(int i =1; i <=number; i++){
			double divisor=1;
				for (int j = 1; j <= i; j++) {
					
					divisor*=j;
				}
				result +=(1.0/divisor);
			}
			System.out.printf("For i = %,6d the sum is %,.3f\n", number, result);
		}
	}
}
