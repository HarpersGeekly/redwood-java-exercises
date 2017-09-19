/**
 * Created by RyanHarper on 9/19/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {
//    For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

//        ==========================================   Loop Basics  ====================================================
//        While:
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
        int i = 5;

        while (i <= 15) {
            System.out.println("i = " + i++);
        }
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        ============================================  Do While =======================================================

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        System.out.println("=========================");
        int x = 0;

        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
        System.out.println("===================");

        int y = 100;

        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        System.out.println("=========================");

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

        System.out.println("=========================");

        for (int a = 2; a <= 100; a++) {
            System.out.println(a);
        }
        System.out.println("=========================");

        for (int b = 5; b >= -10; b -= 5) {
            System.out.println(b);
        }

        System.out.println("=========================");

        for (long c = 2; c < 1000000; c *= c) {
            System.out.println(c);
        }


//        Display a table of powers.
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output:
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 81
//        4      | 16      | 64
//        5      | 25      | 125





//        Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 60 - 0


//        Bonus
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        
    }
}
