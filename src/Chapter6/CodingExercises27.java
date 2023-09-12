package Chapter6;

public class CodingExercises27 {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int num) {
        int row, column;
        if (num < 5) {
            System.out.println("Invalid Value");
        } else {
            String star = "*";
            for (row = 0; row < num; row++) {
                for (column = 0; column < num; column++) {
                    if (row == 0 || row == num - 1 || column == 0 || column == num - 1 || column == row || column == num - 1 - row) {
                        System.out.print(star);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}