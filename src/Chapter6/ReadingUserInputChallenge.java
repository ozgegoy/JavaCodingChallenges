package Chapter6;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        try {
            System.out.println(getInputFromUserConsole(5));
        } catch (NullPointerException e) {
            System.out.println(getInputFromUserScanner(5));
        }

    }

    public static String getInputFromUserConsole(int num) {
        int count = 1, sum = 0, parseIntNumber;
        String number;
        do {
            number = System.console().readLine(" Enter number " + count + ": ");
            count = count + 1;
            parseIntNumber = Integer.parseInt(number);
            sum += parseIntNumber;
        } while (count != num + 1);

        return "Sum " + sum;
    }

    public static String getInputFromUserScanner(int num) {
        Scanner scanner = new Scanner(System.in);
        //int sum = 0, count = 1;
        int count = 1;
        double sum = 0;
        String number;

        do {
            System.out.println(" Enter number " + count + ": ");
            number = scanner.nextLine();
            try {
                //int parseIntNumber = Integer.parseInt(number);
                double parseIntNumber = Double.parseDouble(number);
                count = count + 1;
                sum += parseIntNumber;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        } while (count != num + 1);

        /*for (int count = 1; count < num; count++) {
            System.out.println(" Enter number " + count + ": ");
            number = scanner.nextLine();
            System.out.println("number " + number);
            num2 = Integer.parseInt(number);
            System.out.println("num2before " + num2);
            sum +=num2;
            System.out.println("num2after " + sum);
        }*/

        return "Sum " + sum;
    }

}
