package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        boolean repeat;

        do {
            Input input = new Input();
            System.out.println("What's the radius?");

            Circle c = new Circle(input.getDouble());

            c.printInfo();

            repeat = input.yesNo();

        } while (repeat);

    }
}
