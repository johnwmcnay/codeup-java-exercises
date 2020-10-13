package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        students.put("peterpiper", new Student("Peter", 77, 85, 96));
        students.put("jackhill", new Student("Jack", 72, 65, 83));
        students.put("jillhill", new Student("Jill", 81, 90, 91));
        students.put("mshubbard", new Student("Maye", 50, 61, 73));

        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:");

        do {
            System.out.print("\n");
            for (String key: students.keySet()) {
                System.out.print("|" + key + "| ");
            }

            System.out.println("\n\nWhat student would you like to see more information on?\n");
            System.out.print("> ");

            String userInput = input.getString().toLowerCase();
            Student student = students.get(userInput);

            if (student == null) {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\".\n");
            } else {
                System.out.printf("\nName: %s - GitHub Username: %s\n", student.getName(), userInput);
                System.out.printf("Current Average: %.1f\n\n", student.getGradeAverage());
            }
        } while (input.yesNo("Would you like to see another student?"));

        System.out.println("\nGoodbye, and have a wonderful day!");

    }
}
