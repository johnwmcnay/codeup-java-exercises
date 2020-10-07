package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        boolean repeat;

        do {
            Input input = new Input();

            Circle c = new Circle(input.getDouble("Enter the radius:"));

            c.printInfo();

            repeat = input.yesNo("Do you want to enter another radius?");

        } while (repeat);

        Circle.totalCirclesCreated();

    }
}
