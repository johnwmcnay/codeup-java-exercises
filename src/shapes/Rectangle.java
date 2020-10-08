package shapes;

public class Rectangle {
    protected double length, width;

    public Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
    }


    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double value) {
        this.length = value;
    }

    public void setWidth(double value) {
        this.width = value;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

}
