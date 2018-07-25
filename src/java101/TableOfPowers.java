package java101;

import java.util.Scanner;

/**
 * Created by RyanHarper on 9/19/17.
 */
public class TableOfPowers {
    public static void main(String[] args) {

//        Display a table of powers.
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

        Scanner scan = new Scanner(System.in);
        int userInteger;
        long userSquared;
        long userCubed;
        String userWantsToContinue;

        System.out.println("This app will display a Table of Powers: a number, that number squared, and that number cubed.");

        do {
//        Prompt the user to enter an integer.
            System.out.println("Type a number to go up to:");
            userInteger = scan.nextInt();

//        Display a table of squares and cubes from 1 to the value entered.
            System.out.println("Here is your table: ");
            System.out.println("number | squared | cubed\n" + "------ | ------- | -----");

            for (int i = 1; i <= userInteger; i++) {
                userSquared = (i * i);
                userCubed = (i * i * i);
                System.out.printf("%-7s| ", i);
                System.out.printf("%-8s| ", userSquared);
                System.out.printf("%-5s", userCubed);
                System.out.println();
            }

            scan.nextLine();

//        Ask if the user wants to continue.
            System.out.println("Would you like to continue? Yes/No: ");
            userWantsToContinue = scan.nextLine();

        } while (userWantsToContinue.equalsIgnoreCase("Yes")
                || userWantsToContinue.equalsIgnoreCase("Y"));
        // while user wants to continue, do it again...
        //otherwise...
        System.out.println("See ya later!");
    }
}






