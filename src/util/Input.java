package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.next();
    }

    public boolean yesNo() {
        System.out.print("Would you like to test again? [y/n] ");

        String input = this.getString();

        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {

        int userInput;

        do {
            System.out.printf("(between %d and %d)\n", min, max);
            userInput = this.getInt();

            if (userInput < min || userInput > max) {
                System.out.printf("Invalid input: %d\n", userInput);
            } else {
                break;
            }

        } while (true);

        return userInput;
    }

    public double getDouble() {
        System.out.print("Enter a number: ");
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {

        double userInput;

        do {
            System.out.printf("(between %f or %f)\n", min, max);
            userInput = this.getDouble();

            if (userInput < min || userInput > max) {
                System.out.printf("Invalid input: %f\n", userInput);
            } else {
                break;
            }

        } while (true);

        return userInput;
    }
}
