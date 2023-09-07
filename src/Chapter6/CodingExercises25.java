package Chapter6;

public class CodingExercises25 {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); //false
        System.out.println(canPack(1, 0, 5)); //true
        System.out.println(canPack(0, 5, 4)); //true
        System.out.println(canPack(2, 2, 11)); //true
        System.out.println(canPack(-3, 2, 12)); //false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = (bigCount * 5) + smallCount;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            if (sum < goal) {
                return false;
            } else {
                return goal % 5 <= smallCount;
            }
        }
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        for (int i =0; i<=bigCount; i++){
//            for (int j=0; j<=smallCount; j++){
//                if ((5*i)+j==goal)
//                    return true;
//            }
//        }
//        return false;
//    }
}