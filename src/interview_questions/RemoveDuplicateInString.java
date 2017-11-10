package interview_questions;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by RyanHarper on 11/9/17.
 */
public class RemoveDuplicateInString {
    public static void main(String[] args) {


        String input = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        char[] chars = input.toCharArray(); // convert the String into a charArray

        Set<Character> charSet = new LinkedHashSet<>(); // All the Set implementations remove duplicates.
        // Prepare a LinkedHashSet.

        // iterate through chars array and add each index c to the LinkedHashSet.
        for (char c : chars) {
            charSet.add(c); // and add it to a LinkedHashSet. This will preserve ordering.
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.reverse().toString()); // reverse!

    }
}
