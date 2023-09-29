package Chapter6;

import java.util.Scanner;

public class MaxMinChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter number");
            String nextLine = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextLine);
                if (count == 0 || number < min) {
                    min = number;
                }
                if (count == 0 || number > max) {
                    max = number;
                }
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (count > 0) {
            System.out.println("min number= " + min + " max number " + max);
        } else {
            System.out.println("No valid data ");
        }

    }
}
