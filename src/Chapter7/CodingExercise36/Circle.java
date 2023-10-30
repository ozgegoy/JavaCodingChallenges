package Chapter7.CodingExercise36;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius < 0 ? radius = 0 : radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}
