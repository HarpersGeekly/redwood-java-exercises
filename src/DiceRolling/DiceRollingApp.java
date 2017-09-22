package DiceRolling;

import java.util.Scanner;

/**
 * Created by RyanHarper on 1/9/17.
 */
public class DiceRollingApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice;

        System.out.println("Welcome to the dice rolling app.");

        do {
            rollTwoDice(scan);
            System.out.println("Do you want to continue? Type 'yes' or 'no'");
            userChoice = scan.next();

        } while (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y"));
        System.out.println("Thanks for rolling!");
    }

     public static void rollTwoDice(Scanner scan) {
        //prompt the user for the numberOfSides
        //roll two dice with that numberOfSides
        //output the sum of both
        int numberOfSides;

        System.out.println("How many sides should the two dice have?");
        numberOfSides = scan.nextInt();

        Die firstDie = new Die(numberOfSides);
        firstDie.roll();

        Die secondDie = new Die(numberOfSides);
        secondDie.roll();

        System.out.println("You rolled a " + firstDie.currentFaceValue + " and a " + secondDie.currentFaceValue + ".");
        System.out.println("This is a total of " + (firstDie.currentFaceValue + secondDie.currentFaceValue));
    }
}