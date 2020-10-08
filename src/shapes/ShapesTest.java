package shapes;

//Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
//
//        create a variable of the type Rectangle named box1 and assign it a new instance of the 
//        Rectangle class with a width of 4 and a length of 5
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        create a variable of the type Rectangle named box2 and assign it a new instance
//        of the Square class that has a side value of 5.
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
        System.out.println("box1.getArea() = " + box1.getArea());

        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
        System.out.println("box2.getArea() = " + box2.getArea());


    }
    
}
