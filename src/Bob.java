import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {

            System.out.print("What do you want to say to Bob? ");

            String input = scanner.nextLine();
            String response;

            if (input.endsWith("?")) {
                response = "Sure.";
            } else if (input.endsWith("!")) {
                response = "Whoa, chill out!";
            } else if (input.isEmpty()) {
                response = "Fine. Be that way!";
            } else {
                response = "Whatever.";
            }

            System.out.printf("Bob says: \"%s\"\n\n", response);

            System.out.print("Did you have anything else to say to Bob? [y/n] ");

            userResponse = scanner.nextLine();

        } while (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes"));

    }
}
