package Chapter5;

public class CodingExercises10 {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainingDay = day % 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
        }
    }
}
