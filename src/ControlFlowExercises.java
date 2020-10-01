import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            String letterGrade;

            System.out.print("Please enter a grade: ");
            int grade = scanner.nextInt();

            if (grade > 87) {
                letterGrade = "A";
            } else if (grade > 79) {
                letterGrade = "B";
            } else if (grade > 66) {
                letterGrade = "C";
            } else if (grade > 59) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.printf("%d is a grade of %S.\n\n", grade, letterGrade);
            scanner.nextLine();

            System.out.print("Would you like to continue? [y,n] ");

            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));





//exercise 3
//        Scanner scanner;
//        String input = "yes";
//
//        while (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
//
//            scanner = new Scanner(System.in);
//
//            System.out.print("What number would you like to go up to? ");
//            int num = scanner.nextInt();
//
//
//            System.out.println("\nHere is your table!\n");
//            System.out.println(" number | squared | cubed");
//            System.out.println(" ------ | ------- | -----");
//
//            long square, cube;
//
//            for (int i = 1; i <= num; i++) {
//                square = i * i;
//                cube = square * i;
//                System.out.printf(" %d | %d | %d \n", i, square, cube);
//            }
//            scanner.nextLine();
//            System.out.print("Would you like to continue? [y,n] ");
//            input = scanner.nextLine();
//        }


//exercise 2 FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                if (i % 5 == 0) {
//                    System.out.print("Buzz");
//                }
//                System.out.print("\n");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//exercise 1c
//        int i = 0;
//
//        for (i = 0; i <= 100; i +=2) {
//            System.out.println(i);
//        }
//
//        for (i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (long y = 2; y < 1000000; y *= y) {
//            System.out.println(y);
//        }

//exercise 1b
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i < 100);
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//
//        long y = 2;
//        do {
//            System.out.println(y);
//            y = y * y;
//        } while (y < 1000000);

//exercise 1a
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }
    }
}
