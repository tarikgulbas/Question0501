package bolum05.questions;

import javax.sound.midi.Soundbank;

public class Q0524 {
	public static void main(String[] args) {
		double sum = 0;
		double i = 1;
		while (i < 98) {
			sum = i / (i + 2);
			if (i != 97) {
				System.out.printf("%2d/%2d +", (int) i, (int) i + 2);
			}
			i = i + 2;
			if (i % 20 == 1) {
				System.out.println();
			}
		}
		System.out.print(" 97/99 \t\t= " + sum);
	}

}
