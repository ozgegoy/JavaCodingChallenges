package Chapter5;

public class CodingExercises4 {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
        shouldWakeUp(true, 0);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) && (barking == true)) {
            barking = true;
        } else if ((hourOfDay < 0 || hourOfDay > 23) && (hourOfDay >= 8 || hourOfDay <= 22)) {
            barking = false;
        } else {
            barking = false;
        }
        return barking;
    }
}