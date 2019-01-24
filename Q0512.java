package bolum05.questions;

public class Q0512 {

	public static void main(String[] args) {
		int number = -1;
			while(Math.pow(number, 2)<=12_000){
				number++;
			}
		System.out.print("The last number before the answer is" + (number -1));
		System.out.println(" the square is :" + Math.pow((number -1),2));
		System.out.print("The answer :" + (number));
		System.out.println(" the square is :" + Math.pow((number ),2));
	}

}
