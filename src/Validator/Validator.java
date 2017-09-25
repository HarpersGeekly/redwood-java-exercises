package Validator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/10/17.
 */
public class Validator {
    private Scanner scan;

    public Validator(Scanner scan) {
        this.scan = scan;
    }

//    String stringInput;
//    int intInput;
//    double doubleInput;

//    public Validator.Validator(String stringInput, int intInput, double doubleInput) {
//        this.stringInput = stringInput;
//        this.intInput = intInput;
//        this.doubleInput = doubleInput;
//    }

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
        double doubleInput = getDouble(prompt);

        try {
            System.out.println(prompt);
            doubleInput = scan.nextDouble();
            if (doubleInput < min || doubleInput > max) {
                throw new IllegalArgumentException("ERROR -- Integer is out of range between " + min + " and " + max);
            }
            return doubleInput;
        } catch (InputMismatchException e) {
            System.out.println("ERROR -- Input must be an integer.");
            scan.nextLine();
            getDoubleWithinRange(prompt, min, max);
        } catch (IllegalStateException | IllegalArgumentException e) { //listening for either of these exceptions.
            System.out.println(e.getMessage());
//            if (intInput < min) {
//                System.out.println("ERROR -- Number must be greater than " + min);
//            } else if (intInput > max) {
//                System.out.println("ERROR -- Number must be less than " + max);
//            }
            return getDoubleWithinRange(prompt, min, max);
        }
        scan.nextLine();
        return doubleInput;
    }

    public void setTimeout(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//        boolean yesNo()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        String userWantsToContinue = scan.nextLine();
        return userWantsToContinue.trim().equalsIgnoreCase("Y") || userWantsToContinue.trim().equalsIgnoreCase("Yes");
    }

}
