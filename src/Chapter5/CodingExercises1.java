package Chapter5;

public class CodingExercises1 {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-4);
        checkNumber(0);
    }

    //positive, negative, zero
    public static void checkNumber(int number) {
        System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "zero");
    }

}