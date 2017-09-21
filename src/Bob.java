import java.util.Scanner;

/**
 * Created by RyanHarper on 9/20/17.
 */
public class Bob {
    public static void main(String[] args) {
//        Create a class Bob for the following exercise with a main method.
// Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        // if string has char '?'
//        Bob answers 'Sure.' if you ask him a question.
        // if strings has char '!'
//        He answers 'Whoa, chill out!' if you yell at him.
        // if string is empty.
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
        // else
//        He answers 'Whatever.' to anything else.

        Scanner scan = new Scanner(System.in);
        String message;
        String talkMore;

        do {

            System.out.println("Talk to Bob");
            message = scan.nextLine();

            if (message.endsWith("?")) { /* I originally put .isEmpty() up here in the first condition. Works either way though */
                System.out.println("I don't know.");
            } else if ( (message.endsWith("!") || message.equals(message.toUpperCase()) ) && !message.isEmpty() /* && make sure something is there */ ){
                System.out.println("Whoa, chill out!");
            } else if (message.isEmpty()) {
                System.out.println("Fine. Be that way");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Keep talking? Y/N");

            talkMore = scan.nextLine();

        } while (talkMore.equalsIgnoreCase("Y")
                || (talkMore.equalsIgnoreCase("Yes")));

        System.out.println("Pshh. Was boring anyway");

    }
}


