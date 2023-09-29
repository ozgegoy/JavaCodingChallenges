package Chapter6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CodingExercises28 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        String number;

        while (true) {
            number = scanner.nextLine();
            try {
                int parseIntNumber = Integer.parseInt(number);
                count = count + 1;
                sum += parseIntNumber;
            } catch (NumberFormatException e) {
                if (count == 1) {
                    System.out.println("SUM = 0 AVG = 0");
                } else {
                    int value = (int) sum;
                    double avg = sum / (count - 1);
                    BigDecimal bd = new BigDecimal(avg).setScale(0, RoundingMode.HALF_UP);
                    if (count >= 0) {
                        System.out.println("SUM = " + value + " AVG = " + bd);
                    } else {
                        System.out.println("No valid data ");
                    }
                }
                break;
            }
        }
    }
}
