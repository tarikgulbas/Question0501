package bolum05.questions;

import java.util.Scanner;

public class Q0534 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		int winP = 0;
		int winCP = 0;
		int difference = winP > winCP ? winP - winCP : winCP - winP;

		while (difference < 2) {
			System.out.printf("=================================\nYou : %d\tComputer : %d\n",winP, winCP);
			System.out.println("Scissor (0), Rock (1), Paper (2):");
			int input = user.nextInt();
			int computer = (int) (Math.random() * 3);
			if (input == computer) {
				switch (input) {
				case 0:
					System.out.println("You are scissor and computer is scissor too. It is a draw");
					break;
				case 1:
					System.out.println("You are rock and computer is rock too. It is a draw");
					break;
				case 2:
					System.out.println("You are paper and computer is paper too. It is a draw");
					break;
				}
			} else if (input == 0) {
				System.out.print("You are scissor. ");
				if (computer == 1) {

					System.out.println("Computer is rock.\nRock blunts scissor.\nYou lost.");
					winCP++;
				} else if (computer == 2) {
					System.out.println("Computer is paper.\nScissor cuts paper.\nYou won.");
					winP++;
				}
			} else if (input == 1) {
				System.out.print("You are rock. ");
				if (computer == 0) {

					System.out.println("Computer is scissor.\nRock blunts scissor.\nYou won.");
					winP++;
				} else if (computer == 2) {
					System.out.println("Computer is paper.\nPaper wraps rock.\nYou lost.");
					winCP++;
				}
			} else if (input == 2) {
				System.out.print("You are paper. ");
				if (computer == 0) {

					System.out.println("Computer is scissor.\nScissor cuts paper.\nYou lost.");
					winCP++;
				} else if (computer == 1) {
					System.out.println("Computer is rock.\nPaper wraps rock.\nYou won.");
					winP++;
				}
			}

			difference = winP > winCP ? winP - winCP : winCP - winP;
		}
		System.out.println(winP > winCP ? "YOU WON !!!!!" : "Sorry, you lost... ");
	}

}
