package Chapter6;

public class CodingExercises16 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int firstNumber) {
        int secondNumber = firstNumber;
        int reverse = 0, lastDigit;
        while (firstNumber != 0) {
            lastDigit = firstNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            firstNumber = firstNumber / 10;
        }
        if (secondNumber != reverse) {
            return false;
        }
        return true;
    }
}
