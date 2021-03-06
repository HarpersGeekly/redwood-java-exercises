import validator.Validator;
/**
 * Created by RyanHarper on 9/22/17.
 */
public class HighLow {
    public static void main(String[] args) {

        Validator validator = new Validator();

        System.out.println("Welcome to the High Low Guessing Game.");

        do {

            int counter = 0;
            String prompt = "";
            int randomNumber = generateRandomNumber(1, 100);

//            System.out.println(randomNumber); //TESTING
            System.out.println("Guess a number between 1 and 100:");
            compareUserGuess(validator, 1, 100, randomNumber, counter, prompt);

        } while (validator.yesNo("Would you like to play again? Y/N"));
        System.out.println("Thanks for playing! Bye.");
    }
// =====================================================================================================================

    private static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
//        Can also use Java's Random Class:
//        Random rand = new Random();
//        return rand.nextInt(100) + 1;
    }

    private static void compareUserGuess(Validator validator, int min, int max, int randomNumber, int counter, String prompt) {
        System.out.println("[You've guessed " + counter + " times so far...]");
        int userInput = validator.getIntWithinRange(prompt, min, max);

            if (userInput == randomNumber){
                counter++;
                System.out.println("YOU GOT IT!");
                System.out.println("It took you " + counter + " times to guess.");
                if (counter == 1) {
                    System.out.println("You're psychic!" + "============================");
                } else if(counter <= 6) {
                    System.out.println("You may be psychic, good job!\n" + "============================");
                } else if(counter > 6) {
                    System.out.println("Stay away from Vegas. \n" + "============================");
                }
            } else if (userInput < randomNumber) {
                System.out.println("Higher...");
                counter++;
                compareUserGuess(validator, min, max, randomNumber, counter, prompt);

            } else if (userInput > randomNumber) {
                System.out.println("Lower...");
                counter++;
                compareUserGuess(validator, min, max, randomNumber, counter, prompt);
            }
    }
}


//        Game Development 101
//        Welcome to the world of game development!
//        You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//        The specs for the game are:
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//        Keep track of how many guesses a user makes
//        Set an upper limit on the number of guesses