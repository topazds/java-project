package exam1;

public class Exam01 {
	int countA = 0;
	int countB = 0;
	boolean deuce = false;

	public Exam01(String firstPerson, String secondPerson) {

	}

	public void playerAWin() {
		countA++;
	}

	public void playerBWin() {
		countB++;
	}

	public String getScore() {
		String score;

		if (countA == 1 && countB == 1) {
			score = "Fifteen-All";
		} else if (countA == 2 && countB == 2) {
			score = "Thirty-All";
		} else if (countA == countB && countA >= 3 && countB >= 3) {
			score = "Deuce";
		} else if (countA == 2 && countB == 1) {
			score = "Thirty-Fifteen";
		} else if (countA == 1 && countB == 2) {
			score = "Fifteen-Thirty";
		} else if (countA == 3 && countB == 1) {
			score = "Forty-Fifteen";
		} else if (countA == 1 && countB == 3) {
			score = "Fifteen-Forty";
		} else if (countA == 4 && countB == 1) {
			score = "Win for Player A";
		} else if (countA == 1 && countB == 4) {
			score = "Win for Player B";
		} else if (countA == 3 && countB == 2) {
			score = "Forty-Thirty";
		} else if (countA == 2 && countB == 3) {
			score = "Thirty-Forty";
		} else if (countA == 4 && countB == 2) {
			score = "Win for Player A";
		} else if (countA == 2 && countB == 4) {
			score = "Win for Player B";

		} else if (countA == 4 && countB == 3) {
			score = "Advantage Player A";
		} else if (countA == 3 && countB == 4) {
			score = "Advantage Player B";
		} else if (countA == 5 && countB == 4) {
			score = "Advantage Player A";
		} else if (countA == 4 && countB == 5) {
			score = "Advantage Player B";
		}else if (countA == 6 && countB == 4) {
			score = "Win for Player A";
		}else if (countA == 4 && countB == 6) {
			score = "Win for Player B";
		}

		else if (countB == 1) {
			score = "Love-Fifteen";
		} else if (countB == 2) {
			score = "Love-Thirty";
		} else if (countB == 3) {
			score = "Love-Forty";
		} else if (countB == 4) {
			score = "Win for Player B";
		}

		else if (countA == 1) {
			score = "Fifteen-Love";
		} else if (countA == 2) {
			score = "Thirty-Love";
		} else if (countA == 3) {
			score = "Forty-Love";
		} else if (countA == 4) {
			score = "Win for Player A";
		} else {
			score = "Love-All";
		}

		return score;

	}

}
