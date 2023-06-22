package Chapter6;

public class CodingExercises23 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));  //true
        System.out.println(isPerfectNumber(28));  //true
        System.out.println(isPerfectNumber(5));  //false
        System.out.println(isPerfectNumber(-1));  //false
        System.out.println(isPerfectNumber(0));  //false
        System.out.println(isPerfectNumber(10));  //false
        System.out.println(isPerfectNumber(2));  //false
    }

    public static boolean isPerfectNumber(int number) {
        int count = 0;
        int countNumber = 0;
        while (count < number - 1) {
            count++;
            if (number % count == 0) {
                countNumber += count;
            }
        }
        if (number < 1) {
            return false;
        } else {
            if (countNumber == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
