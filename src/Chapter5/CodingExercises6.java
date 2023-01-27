package Chapter5;

public class CodingExercises6 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;
        if ((long) firstNumber == (long) secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}
