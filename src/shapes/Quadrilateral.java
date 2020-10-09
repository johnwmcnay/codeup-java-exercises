package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length, width;

    public Quadrilateral (double length, double width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}
