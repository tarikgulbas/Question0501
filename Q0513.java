package bolum05.questions;

public class Q0513 {

	public static void main(String[] args) {
		int number = -1;
		while (Math.pow(number, 3) <= 12_000) {
			number++;
		}
		System.out.print("The answer is" + (number - 1));
		System.out.println(" the 3rd power is :" + Math.pow((number - 1), 3));
		System.out.print("The number adter the answer :" + (number));
		System.out.println(" the 3rd power is :" + Math.pow((number), 3));
	}

}
