package Chapter6;

public class CodingExercises24 {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
        numberToWords(11);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number > 9) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }
}
