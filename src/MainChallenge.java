import java.util.Arrays;

public class MainChallenge {
    public static void main(String[] args) {
        calculateMethod(true, 10000, 8, 200);

//        boolean gameOver = true;
//        int score = 1000;
//        int levelCompleted = 8;
//        int bonus = 200;
//
//        calculateMethod(gameOver, score, levelCompleted, bonus);


        calculateMethod(true, 800, 5, 100);

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        calculateMethod(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateMethod(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;

        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final Score: " + finalScore);
        }
    }
}
