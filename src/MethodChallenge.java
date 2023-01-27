public class MethodChallenge {

    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculatedHighScorePosition(1500));
        displayHighScorePosition("Ozge", calculatedHighScorePosition(1000));
        displayHighScorePosition("Tugce", calculatedHighScorePosition(500));
        displayHighScorePosition("Nur", calculatedHighScorePosition(100));
        displayHighScorePosition("Ece", calculatedHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position " + playersPosition + " on the high score list.");
    }

    public static int calculatedHighScorePosition(int playersScore) {
        int result;
        if (playersScore >= 1000) {
            result = 1;
        } else if (playersScore >= 500 && playersScore < 1000) {
            result = 2;
        } else if (playersScore >= 100 && playersScore < 500) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }
}
