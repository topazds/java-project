package exam1;

public class Exam01 {
    boolean deuce = false;
    private int countA = 0;
    private int countB = 0;
    private String playerNameA;
    private String playerNameB;
    private String score;
    private String scoreA;
    private String scoreB;

    public Exam01(String firstPerson, String secondPerson) {
        playerNameA = firstPerson;
        playerNameB = secondPerson;
    }

    public void playerAWin() {
        countA++;
    }

    public void playerBWin() {
        countB++;
    }

    public String convertString(int count) {
        if (count == 1) {
            return "Fifteen";
        } else if (count == 2) {
            return "Thirty";
        } else if (count == 3) {
            return "Forty";
        } else
            return "Love";
    }

    public String getScore() {

        scoreA = convertString (countA);
        scoreB = convertString (countB);

        if (countA > 3 || countB > 3) {
            if (countB - countA == 1) {
                score = "Advantage " + playerNameB;/**/
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
            score = String.format ("%s-All", scoreA);
        } else if (countA == 1 && countB == 1) {
            score = String.format ("%s-All", scoreA);
        } else if (countA == 2 && countB == 2) {
            score = String.format ("%s-All", scoreA);
        } else if (countA == countB) {
            score = ("Deuce");
        } else {
            score = String.format ("%s-%s", scoreA, scoreB);
        }
        return score;

    }
}

