package Chapter6;

public class CodingExercises21 {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        }

        int count = 0;
        while (count <= num) {
            count++;
            if (num % count == 0) {
                System.out.println(count);
            }
        }
    }
}
