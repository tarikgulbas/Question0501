package bolum05.questions;

public class Q0533 {

	public static void main(String[] args) {
		int counter =1 ;
		for (int number = 1; number < 10000; number++) {
			int sum = 0;
			for (int dividor = 1; dividor < number; dividor++) {
				if(number % dividor == 0)
					sum += dividor;
			}
			if(sum == number)
				System.out.printf("The %d. number is %d\n",counter++,number);
		}
	}

}
