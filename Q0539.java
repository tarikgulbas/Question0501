package bolum05.questions;

public class Q0539 {

	public static void main(String[] args) {
		double commision = 0;
		double x = 0;
		while (commision < 30_000) {
			x++;
			commision = 5000 * 0.8 + 5000 * 0.10 + (x - 10_000) * 0.12;
		}
		System.out.printf(" If the sale amount is $ %,.2f, your salary will be $ %,.2f", x, commision);

	}

}
