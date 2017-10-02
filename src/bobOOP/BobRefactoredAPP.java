package bobOOP;

import validator.Validator;

import java.util.Scanner;

/**
 * Created by RyanHarper on 9/25/17.
 */
public class BobRefactoredAPP {
    public static void main(String[] args) {
        Validator validator = new Validator();

        do {
            // input
            Scanner input = new Scanner(System.in);
            System.out.println("Ask anything");
            String msg = input.nextLine();

            // process
            BobRefactored bob = new BobRefactored();
            System.out.println(bob.respondTo(new Message(msg)));

            // output
            System.out.println("Continue? y,n");

        } while (validator.yesNo());
            System.out.println("This was a boring conversation anyway..");

    }

}
