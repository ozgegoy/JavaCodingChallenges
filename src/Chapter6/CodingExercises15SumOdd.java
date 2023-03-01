package Chapter6;

public class CodingExercises15SumOdd {
    public static void main(String[] args) {
//        System.out.println(isOdd(-1));
//        System.out.println(isOdd(1));
//        System.out.println(isOdd(2));
//        System.out.println(isOdd(3));
//        System.out.println(sumOdd(1, 6));
//        sumOdd(1, 11);
//        sumOdd(-1, 10);
        sumOdd(10, 10);
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start >= 0 && end >= 0 && start <= end) {
            int sum = 0;
            for (isOdd(start); start <= end; start++) {
                if (isOdd(start) != false) {
                    sum += start;
                    System.out.println("start = " + start);
                }
            }
            System.out.println("toplam = " + sum);
            return sum;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}
