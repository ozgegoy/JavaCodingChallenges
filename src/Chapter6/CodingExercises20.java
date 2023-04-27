package Chapter6;

public class CodingExercises20 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(97,87,100000));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        } else {
            while (a > 0) {
                if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
                    return true;
                }
                a /= 10;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
