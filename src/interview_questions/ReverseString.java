package interview_questions;
import validator.Validator;

/**
 * Created by RyanHarper on 10/13/17.
 */
public class ReverseString {

    public static void main(String[] args){

// TO FLIP EACH WORD IN A SENTENCE:

        Validator validator = new Validator();
        String sentence = validator.getString("Enter a sentence:");
        String[] stringArray = sentence.split(" ");

        for(int i = 0; i<stringArray.length; i++){
            String flipped = new StringBuilder(stringArray[i]).reverse().toString();
            System.out.print(flipped+" ");
        }
    }
}
// TO FLIP THE ENTIRE SENTENCE:
//    Validator validator = new Validator();
//
//    String sentence = validator.getString("Enter a sentence:");

//    String temp = new StringBuilder(sentence).reverse().toString();
//            System.out.print(temp+" ");
//
//            }
//    }
