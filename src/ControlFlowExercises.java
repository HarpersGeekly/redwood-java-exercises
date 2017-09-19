
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
    }
}
