package interview_questions;

import java.util.Scanner;

/**
 * Created by RyanHarper on 9/22/17.
 */
public class CalculateFactorial {
    public static void main(String[] args) {
//========================================= Calculate Factorial ========================================================
//        Calculate the factorial of a number.
//        A factorial is a number multiplied by each of the numbers before it. <-- that's the hint. Numbers before it. That sounds like an array of numbers. For loop?
//        Factorials are denoted by the exclamation point (n!). Ex:
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//

        Scanner scan = new Scanner(System.in);
        String userWantsToContinue;

        do {
            int userInput = getIntegerWithinRange(1, 10);
            long factorialNumber = calculateFactorial(userInput);
            System.out.println("The factorial of " + userInput + "! = " + factorialNumber);
            System.out.println("Try another? Yes/No");
            userWantsToContinue = scan.next();
            scan.nextLine();

        } while (userWantsToContinue.trim().equalsIgnoreCase("Yes")
                || userWantsToContinue.trim().equalsIgnoreCase("y"));
        System.out.println("Catch ya later!");
    }
// =====================================================================================================================
    private static int getIntegerWithinRange(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + " to be 'factorialized': ");
        Scanner scan = new Scanner(System.in);
//        int userInput = Integer.parseInt(scan.nextLine()); Is the same as:
        int userInput = scan.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("ERROR -- Integer is out of range between " + min + " and " + max);
//        If the input is invalid, prompt the user again:
//        Hint: recursion might be helpful here!
            return getIntegerWithinRange(min, max);
        } else {
            return userInput;
        }
    }

    private static long calculateFactorial(int userInput) {

        long factorialNumber = 1;
        String details = "";

        for (int i = 1; i <= userInput; i++) {
//            factorialNumber *= i; This means: factorialNumber = factorialNumber * 1, so, the factorialNumber.;

            //design it to include all the previous numbers and "x":
            details += (i == 1) ? i : " x " + i;
            System.out.println(i + "! = " + i + " = " + details + " = " + (factorialNumber *= i));
        }
        return factorialNumber;
    }
//        Bonus
//        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//        Use Recursion to implement the factorial
//        Create a method that validates that user input is in a certain range
}
