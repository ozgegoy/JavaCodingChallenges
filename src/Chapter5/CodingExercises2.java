package Chapter5;

import java.math.*;

public class CodingExercises2 {
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = -1;
        if (kilometersPerHour < 0) {
            return result;
        } else {
            double num = (kilometersPerHour * 0.621371192);
            BigDecimal bd = new BigDecimal(num).setScale(2, RoundingMode.HALF_UP);
            double round = Math.round(bd.doubleValue());
            return (long) round;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        String result = "Invalid Value";
        if (kilometersPerHour < 0) {
            System.out.println(result);
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}