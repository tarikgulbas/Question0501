package bolum05.questions;

public class Q0540 {

	public static void main(String[] args) {
		int counterH = 0; // 1 = Head
		int counterT = 0; // 0 = Tail
		while (counterH + counterT < 1_000_000) {
			if ((int) (Math.random() * 2) == 0)
				counterT++;
			else
				counterH++;
		}
		System.out.println("Head : " + counterH);
		System.out.println("Tail : " + counterT);

	}

}
