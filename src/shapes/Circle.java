package shapes;

public class Circle {

    private double radius;
    private static int totalCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        Circle.totalCircles++;
    }

    public static void totalCirclesCreated() {
        System.out.printf("Total circles created: %d\n", Circle.totalCircles);
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
