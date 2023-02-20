package Chapter6;

public class whileLoopChallengeExercises {
    public static void main(String[] args) {
//        System.out.println(isEvenNumber(0));
//        System.out.println(isEvenNumber(1));
//        System.out.println(isEvenNumber(2));

        int count = 4;
        int oddCount = 0;
        int evenCount = 0;
        while (count <= 20) {
            count++;
            if (!isEvenNumber(count)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + count);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total odd number " + oddCount);
        System.out.println("Total even number " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
