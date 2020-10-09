package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
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
        return 4 * this.getLength();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getLength();
    }

//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        return this.getLength() * this.getLength();
//    }
//
//    public double getPerimeter() {
//        return 4 * this.getLength();
//    }
}
