package bolum05.questions;

public class Q0507 {

	public static void main(String[] args) {
		double startTuition = 10_000;
		
		for (int i = 0; i <10; i++) {
			startTuition *= 1.05;
		}
		System.out.printf("Annual Tuition in ten years will be $%,.2f\n",startTuition);
		System.out.printf("4 year college tuition wil be $%,.2f in 10 years.",4*startTuition);
	}

}
