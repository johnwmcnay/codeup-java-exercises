import java.util.Random;

public class HighLow {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber, guess;

        System.out.println("Guess the secret number!");

        do {
            randomNumber =  rand.nextInt(100) + 1;

            guess = MethodsExercises.getInteger(1, 100);

            if (guess > randomNumber) {
                System.out.println("Too high!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Good guess! You're right!");
            }

        } while (guess != randomNumber);


    }
}
