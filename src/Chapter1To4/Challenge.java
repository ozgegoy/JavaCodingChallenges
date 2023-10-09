package Chapter1To4;

public class Challenge {
    public static void main(String[] args) {
        double firstNumber = 20;
        double secondNumber = 80;
        double totalNumber = firstNumber + secondNumber * 100;

        System.out.println(totalNumber);

        double remainderNumber = totalNumber % 40;

        boolean variable = remainderNumber == 0 ? true : false;

        System.out.println("result : " + remainderNumber + " variable : " + variable);

        if (variable == false)
            System.out.println("got some remainder");
    }
}
