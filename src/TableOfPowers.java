import java.util.Scanner;

/**
 * Created by RyanHarper on 9/19/17.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


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

        int userInteger;
        long userSquared;
        long userCubed;
        String userWantsToContinue;

        do {
//        Prompt the user to enter an integer.
            System.out.println("This app will display a Table of Powers");
            System.out.println("Type a number to go up to:");
            userInteger = scan.nextInt();

//        Display a table of squares and cubes from 1 to the value entered.
            System.out.println("Here is your table: ");
            for (int i = 1; i <= userInteger; i++) {
            userSquared = (i * i);
            userCubed = (i * i * i);
            System.out.println(i + "|" + userSquared + "|" + userCubed);
            }
            scan.nextLine();

//        Ask if the user wants to continue.
            System.out.println("Would you like to continue? Yes/No: ");
            userWantsToContinue = scan.nextLine();

        } while (userWantsToContinue.equals("Yes")
                || userWantsToContinue.equals("Y")
                || userWantsToContinue.equals("yes")
                || userWantsToContinue.equals("y"));

        System.out.println("See ya later!");

    }
}






