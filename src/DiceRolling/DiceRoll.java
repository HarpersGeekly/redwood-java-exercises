package DiceRolling;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/5/17.
 */

//something this small and procedural doesn't need a Dice Class.
// But we will make one in DiceRolling.Die.java to be used in DiceRolling.DiceRollingApp.java

public class DiceRoll {
    public static void main(String[] args){
        System.out.println("Welcome to the DiceRolling.Die Rolling App!");
        playGame();
    }

//======================================================================================================================
    private static void playGame() {
        Scanner scan = new Scanner(System.in);
        String playAgain;

        do {
            System.out.println("Enter the number of sides on your two dice");
            int numberOfSidesPerDie = getNumberOfSidesFromUser(scan);

//        “Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            System.out.println("Rolling the two " + numberOfSidesPerDie + "-sided dice...");
            int dieOne = rollDie(numberOfSidesPerDie);
            int dieTwo = rollDie(numberOfSidesPerDie);
            System.out.println("You rolled " + dieOne + " and " + dieTwo + ".");
            System.out.println("Together, your total is " + (dieOne + dieTwo));
            System.out.println("Want to roll the dice again? Y/N");
            playAgain = scan.next();
            scan.nextLine();

        } while (playAgain.trim().equalsIgnoreCase("yes") || playAgain.trim().equalsIgnoreCase("y"));
        System.out.println("See ya later");
    }

//        Ask the user to enter the number of sides for a pair of dice.
    private static int getNumberOfSidesFromUser(Scanner scan) {
        int userInteger;

        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer. Please type in a valid number.");
            // Keeps the scanner from "skipping" the next input
            scan.nextLine();
            return getNumberOfSidesFromUser(scan);
        }
        return userInteger;
    }

    //        Random number generator:
    private static int rollDie(int userInteger) {
        return (int) Math.ceil(Math.random() * userInteger);
    }
}