package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }


//    protected double length, width;
//
//    public Rectangle(double length, double width) {
//        this.setLength(length);
//        this.setWidth(width);
//    }
//
//
//    public double getLength() {
//        return this.length;
//    }
//
//    public double getWidth() {
//        return this.width;
//    }
//
//    public void setLength(double value) {
//        this.length = value;
//    }
//
//    public void setWidth(double value) {
//        this.width = value;
//    }
//
//    public double getArea() {
//        return this.getLength() * this.getWidth();
//    }
//
//    public double getPerimeter() {
//        return 2 * (this.getLength() + this.getWidth());
//    }

}
