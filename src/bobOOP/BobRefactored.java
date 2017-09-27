package bobOOP;

/**
 * Created by RyanHarper on 9/25/17.
 */
public class BobRefactored {

    public String respondTo(Message message) {
        if (message.isQuestion()) {
            return "Sure";
        } else if (message.isShouting()) {
            return "Whoa, chill out!";
        } else if (message.isSilence()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever";
        }
    }
}