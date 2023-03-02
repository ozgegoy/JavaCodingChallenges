package Chapter6;

public class CodingExercises18 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(226));
    }

    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }
        int reverse = 0, lastDigit, evenNumber, sum = 0;
        while (num != 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
            if (lastDigit % 2 == 0) {
                evenNumber = lastDigit;
                sum += evenNumber;
            }
        }
        return sum;
    }
}