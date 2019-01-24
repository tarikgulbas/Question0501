package bolum05.questions;

import java.util.Scanner;

public class Q0509 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.print("Please enter the number of students : ");
		int numberOfStudents = user.nextInt();

		int highestScore = -1;
		String highestScoreName = "";

		int secondScore = -2;
		String secondScoreName = "";

		String name = "";
		int score = -1;

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.printf("Please enter the name of the %d. students : \n", i + 1);
			name = user.next();
			System.out.printf("Please enter %s's score : ", name);
			score = user.nextInt();
			if (score > secondScore) {
				if (score > highestScore) {
					secondScore = highestScore;
					secondScoreName = highestScoreName;
					highestScore = score;
					highestScoreName = name;
				} else {
					secondScore = score;
					secondScoreName = name;
				}

			}
		}
		System.out.printf("%s has the highest score with %d points.\n", highestScoreName, highestScore);
		System.out.printf("%s has the second highest score with %d points.", secondScoreName, secondScore);
	}

}