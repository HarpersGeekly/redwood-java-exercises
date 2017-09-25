package Validator;

import Validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/10/17.
 */
public class ValidatorTestApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Validator validator = new Validator(scan);

        System.out.println("Welcome to the Validator.Validator.Validator.Validator App");
        String userContinue;

        do {
            validateAgain(validator);

            System.out.println("Do you want to validate again? Type 'yes' or 'no'");
            userContinue = scan.next();

        } while (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));
        System.out.println("Thanks for doing something with me today. Take care.");
    }

        public static void validateAgain(Validator validator) {

            int intMin = -100;
            int intMax = 100;

            String intPrompt = "Give me a number between " + intMin + " and " + intMax + ":";
            validator.getIntWithinRange(intPrompt, intMin, intMax);
            System.out.println("Good Job!");

            double doubleMin = 0;
            double doubleMax = 10;

            String doublePrompt = "Give me a number between " + doubleMin + " and " + doubleMax + ":";
            validator.getDoubleWithinRange(doublePrompt, doubleMin, doubleMax);
            System.out.println("Good Job!");
    }
}
