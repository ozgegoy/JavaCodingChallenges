package Chapter5;

public class CodingExercises9 {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            double result = -1;
            return result;
        } else {
            double circleArea = radius * radius * Math.PI;
            return circleArea;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            double result = -1;
            return result;
        } else {
            double rectangleArea = x * y;
            return rectangleArea;
        }
    }
}
