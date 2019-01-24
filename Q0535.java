package bolum05.questions;

public class Q0535 {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i < 625; i++) {
			sum = 1 / (Math.sqrt(i) + Math.sqrt(i+1));
		}
	}

}
