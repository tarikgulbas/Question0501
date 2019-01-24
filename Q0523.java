package bolum05.questions;

public class Q0523 {

	public static void main(String[] args) {
		final int number = 5000;
		double sum1 =0;
		double sum2 =0;
		for (double n = 1; n <= number; n++) {
			sum1 += 1/n;
		}
		for (double n = number; n > 0; n--) {
			sum2 += 1/n;
		}
		
		System.out.println("From small to larger (left to right) the sum is " + sum1);
		System.out.println("From large to smaller (right to left) the sum is " + sum2);
	}

}
