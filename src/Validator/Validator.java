package Validator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/10/17.
 */
public class Validator {

    private Scanner scan;

//    public Validator(Scanner scan) {
//        this.scan = scan;
//    }

    public Validator() {
        this.scan = new Scanner(System.in);
    }

    public int getInt(String prompt) {

        System.out.println(prompt);
        int intInput;

        try {
            intInput = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer");
            scan.next();
            return getInt(prompt);
        }
        scan.nextLine();
        return intInput;
    }

    public int getIntWithinRange(String prompt, int min, int max) {

        int intInput = getInt(prompt);

        try {
            if (intInput < min || intInput > max) {
                throw new IllegalArgumentException("ERROR -- Integer is out of range between " + min + " and " + max);
            }
        } catch (IllegalStateException | IllegalArgumentException e) { //listening for either of these exceptions.
            System.out.println(e.getMessage());

            return getIntWithinRange(prompt, min, max);
        }
        return intInput;
    }

    public double getDouble(String prompt) {

        System.out.println(prompt);
        double doubleInput;

        try {
            doubleInput = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer");
            scan.next();
            return getDouble(prompt);
        }
        scan.nextLine();
        return doubleInput;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {

        try {
            double doubleInput = getDouble(prompt);

            if (doubleInput < min || doubleInput > max) {
                throw new IllegalArgumentException("ERROR -- Integer is out of range between " + min + " and " + max);
            }
            return doubleInput;
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer.");
            scan.nextLine();
            return getDoubleWithinRange(prompt, min, max);
        } catch (IllegalStateException | IllegalArgumentException e) { //listening for either of these exceptions.
            System.out.println(e.getMessage());
            return getDoubleWithinRange(prompt, min, max);
        }
    }

    public void setTimeout(int milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean yesNo() {

        String userWantsToContinue = scan.nextLine();
        return userWantsToContinue.trim().equalsIgnoreCase("Y") || userWantsToContinue.trim().equalsIgnoreCase("Yes");
    }



// ========== getString() isn't worth it to have in a validator  =======================================================

    public String getString(String prompt) {

        System.out.println(prompt);
        String stringInput;

        try {
            stringInput = scan.nextLine();
        } catch (IllegalArgumentException e ) {
            System.out.println("ERROR -- Input must be valid");
            scan.next();
            return getString(prompt);
        }
        return stringInput;
    }
}
