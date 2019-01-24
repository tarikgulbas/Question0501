package bolum05.questions;

public class Q0503 {

	public static void main(String[] args) {
		final double KG_TO_POUND = 2.2;
		System.out.println("Kilogram	Pounds");
		for (int i = 1; i < 200; i =i+2) {
			System.out.printf("%4d		%5.1f\n",i,KG_TO_POUND * i);
			
		}
	}

}
