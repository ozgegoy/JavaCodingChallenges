package Chapter7.CodingExercise37;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width < 0 ? width = 0 : width;
    }

    public double getLength() {
        return length < 0 ? length = 0 : length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }
}
