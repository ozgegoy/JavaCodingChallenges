package Chapter6;

public class whileAndDoWhileStatements {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

//        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }

//        boolean isReady = false;
//        int j = 1;
//        while (isReady) {
//            if (j > 5) {
//                break;
//            }
//            System.out.println("j: " + j);
//            j++;
//        }

//        boolean isReady = false;
//        int j = 1;
//        do {
//            if (j > 5) {
//                break;
//            }
//            System.out.println("j: " + j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
