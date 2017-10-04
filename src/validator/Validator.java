package validator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/10/17.
 */
public class Validator {

    private Scanner scan;

//    public validator(Scanner scan) {
//        this.scan = scan;
//    }

    public Validator() {
        this.scan = new Scanner(System.in);
    }

    public int getInt(String prompt) {

        System.out.println(prompt);
        String intInput;
        intInput = scan.nextLine();

        try {
            return Integer.valueOf(intInput);
        } catch (NumberFormatException e) {
            System.out.println("ERROR -- Input must be an integer");
            return getInt(prompt);
        }
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
        String doubleInput;
        try {
            doubleInput = scan.nextLine();
            return Double.valueOf(doubleInput);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR -- Input must be an integer");
            return getDouble(prompt);
        }
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

    public boolean yesNo(){
        String userWantsToContinue;

        try {
            userWantsToContinue = scan.nextLine();
            if (!userWantsToContinue.toLowerCase().startsWith("y") && !userWantsToContinue.toLowerCase().startsWith("n")){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e ) {
            System.out.println("ERROR -- Input must be a Y/Yes or N/No");
            return yesNo();
        }

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
