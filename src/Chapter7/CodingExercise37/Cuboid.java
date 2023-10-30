package Chapter7.CodingExercise37;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height < 0 ? height = 0 : height;
    }

    public double getVolume() {
        return getHeight() * getArea();
    }
}
