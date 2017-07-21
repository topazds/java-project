package exam1;

public class Exam01 {
	int countA = 0;

	public Exam01(String firstPerson, String secondPerson) {

	}

	public void playerAWin() {
		countA++;
	}

	public void playerBWin() {
	}

	public String getScore() {
		String score;
		if (countA == 1) {
			score = "Fifteen-Love";
		} else if (countA == 2) {
			score = "Thirty-Love";
		} else if (countA == 3) {
			score = "Forty-Love";
		}

		else {
			score = "Love-All";
		}
		return score;
	}

}
