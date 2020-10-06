package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.printf("Area: %f\nCircumference: %f\n", this.getArea(), this.getCircumference());
    }
}
