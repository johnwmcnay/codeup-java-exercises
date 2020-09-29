import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.printf("%s\n%s\n%s\n", word1, word2, word3);

        scanner = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println(sentence);

        System.out.println("Enter the dimensions (width and height)");
        String num1 = scanner.next();
        String num2 = scanner.next();

        int width = Integer.parseInt(num1);
        int length = Integer.parseInt(num2);

        int area = width * length;
        int perimeter = 2 * (width + length);

        System.out.printf("A room that is %s by %s has an area of %s square units and a perimeter of %s.", width, length, area, perimeter);

    }
}
