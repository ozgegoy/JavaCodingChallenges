package Chapter7.CodingExercise36;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height < 0 ? height = 0 : height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
