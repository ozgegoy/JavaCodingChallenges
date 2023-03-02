package Chapter6;

public class CodingExercises17 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(11));
        System.out.println(sumFirstAndLastDigit(156));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum, last, first;
        last = number % 10;
        int reverse = 0, lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        first = reverse % 10;
        sum = last + first;
        return sum;
    }
}
