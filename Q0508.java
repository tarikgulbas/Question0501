package bolum05.questions;

import java.util.Scanner;

public class Q0508 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.print("Please enter the number of students : ");
		int numberOfStudents = user.nextInt();
		String highestScoreName = "";
		int highestScore = -1;
		String name = "";
		int score = -1;
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.printf("Please enter the name of the %d. students : \n", i + 1);
			name = user.nextLine();
			System.out.printf("Please enter %s's score : ", name);
			score = user.nextInt();

			if (score > highestScore) {
				highestScoreName = name;
				highestScore = score;
			} 

		}
		System.out.printf("%s has the highest score with %d points.\n", highestScoreName, highestScore);
	}

}
