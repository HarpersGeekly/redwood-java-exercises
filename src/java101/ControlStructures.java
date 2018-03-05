package java101;

import java.util.Scanner;

/**
 * Created by RyanHarper on 9/19/17.
 */
public class ControlStructures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");

        int aNumber = input.nextInt();

        if ((aNumber % 2) == 0) {
            System.out.println(aNumber + " is even");
        } else {
            System.out.println(aNumber + " is odd");
        }
        input.nextLine();
//        System.out.println("Redwood" == "Redwood"); //obviously true
        System.out.println("Enter the name of your cohort");
        String cohort = input.nextLine();
        String expectedCohort = "Redwood";
        System.out.println("Redwood" == cohort); //false
        System.out.println(expectedCohort == cohort); //  Are these two objects the same in the memory?? No. False. String is not values, they're a bunch of characters
        System.out.println(cohort.equals("Redwood")); // checks contents of the String! compare character by character. True.
        System.out.println(expectedCohort.equals(cohort)); // same. True.

        int age = 20;
        switch(age) { // only Strings and integer values are valid inputs for a switch
            case 20:
                System.out.println("You are 20 years old");
                break; // fallthrough works the same way in Java
            default:
                System.out.println("You are " + age + " years old");
        }

        // =========================== WHILE LOOP ====================================================
        // modulus using a while ?

        int dividend = 12;
        int divisor = 5;
        int remainder = dividend;
        // for loop when you know how mny times you want it to run
        // while loop when you don't know how many times you want it to run, even none at all
        // do while loop when you want it to run at least once
        while(remainder > divisor) // while 12 > 5, true
             {
            remainder -= divisor; // subtract 5 from 12 which equals 7. 7 is still > 5 so run loop again, subtract 5 now from 7 which is 2.
             }
        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is " + remainder);
        // the remainder of 12 divided by 5 = 2;

        //============================ DO WHILE =========================================================
        // ask the user at least once! (do while)

        int positiveNumber;
        do {
            System.out.println("Enter a positive number");
            positiveNumber = input.nextInt();
        } while (positiveNumber <= 0);
        System.out.println("Thanks.");


        //=============================== FOR LOOP ===================================================

        int base = 2;
        int exponent = 5; // 2^5 => 32
        int result = 1;

        for(int i = 0; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("2^5 = " + result);

        // ==================================== GUESS THE NUMBER, using break ==========================================

        int secretNumber = 7;
        int guess;
        int chances = 0;

        do {
            System.out.println("Guess a number between 1 and 10:");
            guess = input.nextInt();
            chances++;

            if (chances == 3) {
                break;
            }
        }  while (guess != secretNumber);
        if (guess == secretNumber) {
            System.out.println("Nice job!");
        } else {
            System.out.println("You ran out of chances! The number was " + secretNumber + "!");
        }

        //========================= Continue ===========================================================================

        for (int counter = 0; counter <= 10; counter++) {
            if(counter == 5) {
                System.out.println("Five");
                continue;
            } else if (counter == 8) {
                System.out.println("Eight");
                continue;
            }
            System.out.println("counter = " + counter);
        }


    }
}
