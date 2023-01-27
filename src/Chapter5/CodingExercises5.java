package Chapter5;

public class CodingExercises5 {
    public static void main(String[] args) {
        isLeapYear(1700);
        isLeapYear(1800);
        isLeapYear(1900);
        isLeapYear(2100);
        isLeapYear(2200);
        isLeapYear(2300);
        isLeapYear(2500);
        isLeapYear(2600);

        isLeapYear(1600);
        isLeapYear(2000);
        isLeapYear(2400);

        isLeapYear(1924);

        isLeapYear(10000);
        isLeapYear(-1600);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
