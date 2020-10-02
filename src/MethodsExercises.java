//import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int x = 12;
        int y = 3;

        System.out.printf("x = %d, y = %d\n", x, y);
        System.out.printf("x + y = %s\n", add(x, y));
        System.out.printf("x - y = %s\n", subtract(x, y));
        System.out.printf("x * y = %s\n", multiply(x, y));
        System.out.printf("x / y = %s\n", divide(x, y));
        System.out.printf("x %% y = %s\n", modulus(x, y));
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
