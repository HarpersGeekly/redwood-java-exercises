package diceRolling;
import validator.Validator;
/**
 * Created by RyanHarper on 1/5/17.
 */

//something this small and procedural doesn't need a Dice Class.
// But we will make one in diceRolling.Die.java to be used in diceRolling.DiceRollingApp.java
public class DiceRoll {
    public static void main(String[] args){

        System.out.println("Welcome to the Dice Rolling App!");
        playGame();
    }

    //======================================================================================================================
    private static void playGame() {
        Validator validator = new Validator();
//        String playAgain; No need with new yesNo() method being called on validator.

        do {
//        Ask the user to enter the number of sides for a pair of dice.
            int numberOfSidesPerDie = validator.getInt("Enter the number of sides on your two dice:");

//        “Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            System.out.println("Rolling the two " + numberOfSidesPerDie + "-sided dice...");
            int dieOne = rollDie(numberOfSidesPerDie);
            int dieTwo = rollDie(numberOfSidesPerDie);
            System.out.println("You rolled " + dieOne + " and " + dieTwo + ".");
            System.out.println("Together, your total is " + (dieOne + dieTwo));

        } while (validator.yesNo("Want to roll the dice again? Y/N"));
        System.out.println("See ya later");
    }
    //        Random number generator:
    private static int rollDie(int userInteger) {
        return (int) Math.ceil(Math.random() * userInteger);
    }
}