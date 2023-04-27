package Chapter6;

public class CodingExercises22 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9,9));
        System.out.println(getGreatestCommonDivisor(15,9));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        if (firstNum < 10 || secondNum < 10) {
            return -1;
        }
        while (firstNum != secondNum) {
            if (firstNum > secondNum)
                firstNum = firstNum - secondNum;
            else {
                secondNum = secondNum - firstNum;
            }
        }
        return secondNum;
    }

//    public static int getGreatestCommonDivisor(int first, int second){
//
//        if ((first >= 10) && (second >= 10)){
//            while (true){
//                int remainder = second % first;
//                if (remainder == 0){
//                    return first;
//                }
//                else {
//                    second = first;
//                    first = remainder;
//                }
//            }
//        }
//        return -1;
//    }
}
