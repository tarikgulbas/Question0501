package bolum05.questions;

public class Q0527 {
	public static void main(String[] args) {
		int counter=0;
		for (int year = 101; year < 2100; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				counter++;
				System.out.printf("%5d",year);
				if(counter%10 ==0 && counter!=0){
					System.out.println();
			}

			}
		}
		System.out.printf("\n There are %d leap years between 101 -2100", counter);
	}
}
