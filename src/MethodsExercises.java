import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        boolean repeat;
//
//        int x = 12;
//        int y = 3;
//
//        System.out.printf("x = %d, y = %d\n", x, y);
//        System.out.printf("x + y = %s\n", add(x, y));
//        System.out.printf("x - y = %s\n", subtract(x, y));
//        System.out.printf("x * y = %s\n", multiply(x, y));
//        System.out.printf("x / y = %s\n", divide(x, y));
//        System.out.printf("x %% y = %s\n", modulus(x, y));
//
//
//        do {
//
//            int numInput = getInteger(1, 10);
//            long answer = factorial(numInput);
//
//            System.out.printf("%d! = %d\n", numInput, answer);
//            System.out.print("Would you like to continue? [y/n] ");
//            String response = input.nextLine();
//            repeat = response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
//
//        } while (repeat);

        do {


            System.out.print("How many sides on each die? ");
            int sides = input.nextInt();
            System.out.println("Type ROLL when you're ready to test your luck!");
            do {

                String response = input.nextLine();
                if (response.equalsIgnoreCase("roll")) {
                    break;
                }

            } while (true);

            rollPairOfDice(6);

            System.out.print("Would you like to roll again? [y/n] ");
            String response = input.nextLine();
            if (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);


    }

    public static void rollPairOfDice(int sides) {

        int rollOne = rollDie(sides);
        int rollTwo = rollDie(sides);

        System.out.printf("You rolled a pair of %d-sided dice and got: %d %d\n", sides, rollOne, rollTwo);

    }

    public static int rollDie(int sides) {
        Random rand = new Random(); //instance of random class;

        return rand.nextInt(sides) + 1;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1L;
        }

        long total = 1;

        for (int i = n; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Enter a number between %d and %d:\n", min, max);
            num = input.nextInt();

            if (num < min || num > max) {
                System.out.printf("%d is an invalid input.\n", num);
            } else {
                break;
            }
        } while (true);

        return num;
    }


    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }
}
