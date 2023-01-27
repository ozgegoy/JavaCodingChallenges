package Chapter5;

public class CodingExercises7 {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sumNumber) {
        if ((firstNumber + secondNumber) == sumNumber) {
            return true;
        } else {
            return false;
        }
    }
}
