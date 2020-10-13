package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
//        peterpiper jackhill jill mshubbard

        Student student1 = new Student("Peter", 77, 85, 96);
        Student student2 = new Student("Jack", 72, 65, 83);
        Student student3 = new Student("Jill", 81, 90, 91);
        Student student4 = new Student("Maye", 50, 61, 73);

        Input input = new Input();

        students.put("peterpiper", student1);
        students.put("jackhill", student2);
        students.put("jillhill", student3);
        students.put("mshubbard", student4);

        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");

        for (String key: students.keySet()) {
            System.out.print("|" + key + "| ");
        }

        System.out.println("\n\nWhat student would you like to see more information on?\n");

        do {
            System.out.print("> ");

            String userInput = input.getString();

            Student student = students.get(userInput);

            if (student == null) {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\".\n");
            } else {

                System.out.printf("\nName: %s - GitHub Username: %s\n", student.getName(), userInput);
                System.out.printf("Current Average: %.1f\n\n", student.getGradeAverage());
                //Name: Zach - GitHub Username: zgulde
                //Current Average: 87.4
            }
            System.out.println("Would you like to see another student?\n");
        } while (true);

    }
}
