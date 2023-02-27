package Chapter6;

public class digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number > 0) {
            int totalNumber = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                number = number / 10;
                totalNumber += lastDigit;
            }
            return totalNumber;
        }
        return -1;
    }

//    public static int totalNumber(int number) {
//        int totalNumber = 0;
//        while (number != 0) {
//            int lastDigit = sumDigits(number) % 10;
//            number = number / 10;
//            totalNumber += lastDigit;
//        }
//        return totalNumber;
//    }
}
