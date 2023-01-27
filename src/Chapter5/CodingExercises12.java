package Chapter5;

public class CodingExercises12 {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 33));
        System.out.println(isCatPlaying(false, 25));
    }

//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if (summer == false) {
//            if (temperature >= 25 && temperature <= 35) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            if (temperature >= 25 && temperature <= 45) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

    public static boolean isCatPlaying(boolean summer, int temp){
        if (summer && temp >=25 && temp <=45) return true;
        return !summer && temp >= 25 && temp <= 35;
    }
}
