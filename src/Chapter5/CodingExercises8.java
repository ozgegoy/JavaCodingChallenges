package Chapter5;

public class CodingExercises8 {
    public static void main(String[] args) {
//        System.out.println(isTeen(13));
//        System.out.println(isTeen(19));
//        System.out.println(isTeen(15));
//        System.out.println(isTeen(20));
//        System.out.println(isTeen(12));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));


    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (isTeen(firstNumber) == true || isTeen(secondNumber) == true || isTeen(thirdNumber) == true) {
            return true;
        } else {
            return false;
        }
    }
}
