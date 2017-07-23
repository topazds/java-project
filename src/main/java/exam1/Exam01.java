package exam1;

public class Exam01 {
	int countA = 0;
	int countB = 0;
	boolean deuce = false;
	String playerNameA;
	String playerNameB;
	String score;
	String scoreA;
	String scoreB;

	public Exam01(String firstPerson, String secondPerson) {
		playerNameA = firstPerson;
		playerNameB = secondPerson;
	}

	public void playerAWin() {
		countA++;
		if (countB == 0) {
			scoreB = "Love";
		}
		if (countA == 1) {
			scoreA = "Fifteen";
		}
		if (countA == 2) {
			scoreA = "Thirty";
		}
		if (countA == 3) {
			scoreA = "Forty";
		}
	}

	public void playerBWin() {
		countB++;
		if (countA == 0) {
			scoreA = "Love";
		}
		if (countB == 1) {
			scoreB = "Fifteen";
		}
		if (countB == 2) {
			scoreB = "Thirty";
		}
		if (countB == 3) {
			scoreB = "Forty";
		}
	}

	public String getScore() {

		if (countA > 3 || countB > 3) {
			if (countB - countA == 1) {
				score = "Advantage " + playerNameB;
			} else if (countA - countB == 1) {
				score = "Advantage " + playerNameA;
			} else if (countA - countB >= 2) {
				score = "Win for " + playerNameA;
			} else if (countB - countA >= 2) {
				score = "Win for " + playerNameB;
			} else {
				score = "Deuce";
			}
		} else if (countA == 0 && countB == 0) {
			score = "Love-All";
		} else if (countA == 1 && countB == 1) {
			score = "Fifteen-All";
		} else if (countA == 2 && countB == 2) {
			score = "Thirty-All";
		} else if (countA == countB) {
			score = "Deuce";
		} else {
			score = scoreA + "-" + scoreB;
		}

		return score;

	}

}
