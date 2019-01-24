package bolum05.questions;

public class Q0520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int startNumber = 2;
		final int endNumber = 1000;
		boolean prime = true;
		int counter = 0;
		for (int i = startNumber; i < endNumber; i++) {
			prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					prime = false;
			}
			if (prime == true) {
				System.out.printf("%4d",i);
				counter++;
			}
			if (counter % 8 == 0 && counter != 0) {
				System.out.println();
				counter = 0;
			}
		}
	}

}
