package validator;
/**
 * Created by RyanHarper on 1/10/17.
 */
public class ValidatorTestApp {
    public static void main(String[] args) {

        Validator validator = new Validator();

        System.out.println("Welcome to the validator Test App");

        do {
            validateAgain(validator);

            System.out.println("Do you want to validate again? Type 'yes' or 'no'");

        } while (validator.yesNo());
        System.out.println("Goodbye.");
    }

        public static void validateAgain(Validator validator) {

            validator.getInt("Give me a number");
            System.out.println("Thanks");

            int intMin = -100;
            int intMax = 100;

            validator.getIntWithinRange("Give me a number between " + intMin + " and " + intMax + ":", intMin, intMax);
            System.out.println("Good Job!");

            double doubleMin = 0;
            double doubleMax = 10;

            validator.getDoubleWithinRange("Give me a number between " + doubleMin + " and " + doubleMax + ":", doubleMin, doubleMax);
            System.out.println("Good Job!");
    }
}
