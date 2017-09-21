/**
 * Created by RyanHarper on 9/20/17.
 */
public class StringExercise {
    public static void main(String[] args) {

//        For each of the following output examples, create a string variable named message that contains the desired
//        output and print it out to the console.
//        Do this with only one string variable and one print statement.

//        We don't need no education
//        We don't need no thought control
        String message;

        message = "We don't need no education  \n";
        message += "We don't need no thought control \n";


//        Check "this" out!, "s inside of "s!
        message += "Check \"this\" out!, \"s inside of \"s! \n";
//        In windows, the main drive is usually C:\
        message += "In windows, the main drive is usually C:\\  \n";

//        I can do backslashes \, double backslashes \\, and the amazing triple backslash \\\!
        message += "I can do backlashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!  \n";

        System.out.println(message);

    }
}

