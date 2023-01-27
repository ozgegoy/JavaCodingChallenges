package Chapter6;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println("Numbers that can be divided by both 3 and 5: " + i);
                sum += i;
                count++;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
