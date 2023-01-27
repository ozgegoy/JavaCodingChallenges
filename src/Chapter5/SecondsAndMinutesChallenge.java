package Chapter5;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid value(" + seconds + ")";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid value(" + minutes + ")";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "Invalid value(" + seconds + ")";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
