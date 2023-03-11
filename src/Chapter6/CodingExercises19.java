package Chapter6;

public class CodingExercises19 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int firstDigit, int secondDigit) {
        if ((firstDigit < 10 || firstDigit > 99) || (secondDigit < 10 || secondDigit > 99)) {
            return false;
        } else {
            while (firstDigit > 0) {
                if (firstDigit % 10 == secondDigit % 10 || firstDigit % 10 == secondDigit / 10) {
                    return true;
                }
                firstDigit /= 10;
            }
        }
        return false;
    }

//    public static int reverse(int num) {
//        if (num < 0) {
//            return -1;
//        }
//        int reverse = 0, lastDigit;
//        while (num != 0) {
//            lastDigit = num % 10;
//            reverse = (reverse * 10) + lastDigit;
//            num = num / 10;
//        }
//        return reverse;
//    }
}
