package Chapter6;

import java.util.ArrayList;
import java.util.List;

public class CodingExercises22List {
    public static void main(String[] args) {
        getGreatestCommonDivisor(9,9);
        getGreatestCommonDivisor(15,9);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(25,15);
        getGreatestCommonDivisor(12,30);
        getGreatestCommonDivisor(81, 153);
    }

    public static void getGreatestCommonDivisor(int firstNum, int secondNum) {
        int count = 0;
        List<Integer> list=new ArrayList<>();
        while (count <= firstNum) {
            count++;
            if ((firstNum % count == 0) && (secondNum % count == 0)) {
                list.add(count);
            }
        }
        if (firstNum < 10 || secondNum < 10) {
            System.out.println("Invalid Value");
        }else {
            System.out.println(list.get(list.size()-1));
        }
    }
}
