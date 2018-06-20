package interview_questions;
import validator.Validator;
/**
 * Created by RyanHarper on 2/27/18.
 */
public class FibonacciGenerator {
    public static void main(String[] args) {
        Validator validator = new Validator();
        System.out.println(" =========================================== \n Welcome to the Fibonacci Number Generator! \n ===========================================");
        validator.setTimeout(1000);
        String userContinue;

        do {
            int max = validator.getInt("To what number would you like the Fibonacci sequence to go up to?: ");
            System.out.println("The Fibonacci Sequence up to " + max + ":");
            getFibonacciSequence(validator, max);
            userContinue = validator.getString("Would you like to try again? Yes/No");

        } while (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Thanks, Goodbye");
    }

    private static void getFibonacciSequence(Validator validator, int max) {
        int x = 0;
        int y = 1;
//        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
        for (int i = 1; i <= max; i++) {
            System.out.println(x);
            x = x + y;
            y = x - y;
            validator.setTimeout(250);
            if (x >= max) {
                System.out.println("It takes " + i + " Fibonacci sequence iterations to approach " + max + ".");
                return;
            }
        }
    }
}


// the generator will take the last two numbers before it and add them together