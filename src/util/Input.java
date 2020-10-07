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
        System.out.print("Would you like to run again? [y/n] ");

        String input = this.getString();

        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt + " [y/n] ");

        String input = this.getString();

        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        return this.scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.print(prompt + " ");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {

        int userInput;

        do {
            userInput = this.getInt(String.format("Enter an integer between %d and %d:", min, max));

            if (userInput < min || userInput > max) {
                System.out.printf("Invalid input: %d\n", userInput);
            } else {
                break;
            }

        } while (true);

        return userInput;
    }

    public int getInt(int min, int max, String prompt) {

        int userInput;

        do {
            userInput = this.getInt(prompt);

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

    public double getDouble(String prompt) {
        System.out.print(prompt + " ");
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {

        double userInput;

        do {
            userInput = this.getDouble(String.format("Enter a number between %f and %f:", min, max));

            if (userInput < min || userInput > max) {
                System.out.printf("Invalid input: %f\n", userInput);
            } else {
                break;
            }

        } while (true);

        return userInput;
    }
}
