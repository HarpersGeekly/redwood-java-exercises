package java101;

import validator.Validator;

/**
 * Created by RyanHarper on 9/19/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

        Validator validator = new Validator();
//    For all of the following exercises, create a new class named java101.ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

//        ==========================================   Loop Basics  ====================================================
//        While:
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
        int i = 5;

        while (i <= 15) {
            System.out.print(i++ + " ");
        }
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        ============================================  Do While =======================================================

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        System.out.println();
        System.out.println("=========do while ================");
        int x = 0;

        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
        System.out.println("=========do while ================");

        int y = 100;

        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        System.out.println("========do while =================");

        long z = 2;
        do {
            System.out.println(z);
            z *= z;
        } while (z < 1000000);
        // Output should equal:
        //        2
        //        4
        //        16
        //        256
        //        65536

//  ======================================================      For     ================================================

//        refactor the previous two exercises to use a for loop instead

        System.out.println("========== for ===============");

        for (int a = 2; a <= 100; a++) {
            System.out.println(a);
        }

        System.out.println("========== for ===============");

        for (int b = 5; b >= -10; b -= 5) {
            System.out.println(b);
        }

        System.out.println("=========== for ==============");

        for (long c = 2; c < 1000000; c *= c) {
            System.out.println(c);
        }
        //============================================= BONUS ============================================

//    1. Prompt the user to enter an integer between 1 and 7 and output the day of the week it maps to (Sunday is 1 and Saturday is 7)
        int day = validator.getIntWithinRange("Enter a number between 1 and 7:", 1, 7);
        String thDay = "th day of the week";
        switch (day) {
            case 1:
                String numberAsString = Integer.toString(day);
                numberAsString = "first";
                System.out.println("Sunday is the " + numberAsString + "st day of the week");
                break;
            case 2:
                System.out.println("Monday is the " + day + "nd day of the week");
                break;
            case 3:
                System.out.println("Tuesday is the " + day + "rd day of the week");
                break;
            case 4:
                System.out.println("Wednesday is the " + day + thDay);
                break;
            case 5:
                System.out.println("Thursday is the " + day + thDay);
                break;
            case 6:
                System.out.println("Friday is the " + day + thDay);
                break;
            case 7:
                System.out.println("Saturday is the " + day + thDay);
                break;
        }

        //============================================= BONUS ============================================

//2. Prompt the user for an integer. Output whether or not the number is prime.
        //checks whether an int is prime or not;


        do {
            int n = validator.getInt("Enter a number");
            boolean result = validator.isPrime(n);
            if (result) {
                System.out.println(n + " is a prime number!");
            } else {
                System.out.println(n + " is not a prime number!");
            }

        } while (validator.yesNo("Try another prime? Y/N"));

//    private static boolean isPrime(int n) {
//        return IntStream.rangeClosed(2, n/2).noneMatch(i -> n%i == 0);
//    }
//        private static boolean isPrime(int n){
//            for(int i = 2 ; i <= n/2; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }

        //============================================= BONUS ============================================

//3. Prompt the user to enter an integer and output all the days of the week that
//    have no more letters than the integer given.

//        int n = validator.getInt("Enter a number:");




//            4. Prompt the user to enter their name. Output whether the name is
//    - short (less than 4 characters), medium (less than 9), long (more than 8)
//    - contains the letter 'y'
//            - is a palindrome

//5. Print out all times from 1:00am to 12:00pm.
//            Example:
//            1:00am
//1:01am
//1:02am
//    etc.
//this will help you for this bonus...
//    https://stackoverflow.com/questions/12421444/how-to-format-a-number-0-9-to-display-with-2-digits-its-not-a-date

    }
}

