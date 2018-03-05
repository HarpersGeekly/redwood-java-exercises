package java101;

import java.util.Scanner;

/**
 * Created by RyanHarper on 9/20/17.
 */
public class StringsLecture {
    public static void main(String[] args) {
        String name = " Ryan ";
        System.out.println("'" + name + "'");

        name = name.trim(); //Returns a copy of the string without leading and trailing whitespaces.
        System.out.println("'" + name + "'");

        if (name.equalsIgnoreCase("Ryan")) {
            System.out.println("They are the same");

        } else {
            System.out.println("They are not the same");
        }
//======================================================================================================================

        char letter = 'F'; // char has a value

        if (name.startsWith(String.valueOf(letter))) {
            System.out.println("Starts with F");
        } else {
            System.out.println(name + " doesn't start with " + letter);
        }

//======================================================================================================================

        String lastTwoChars = "ry"; // String is not a value. It's an array of characters.

        if (name.endsWith(lastTwoChars)) {
            System.out.println(name + " ends with " + lastTwoChars);
        } else {
            System.out.println(name + " doesn't end with " + lastTwoChars);
        }

//======================================================================================================================

        int index = name.indexOf('n');
        System.out.println("index of n is " + index);
        // if it doesn't find it, it will give you a -1.

//======================================================================================================================
        //count how many n's are in String name...
        int counter = 0;
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'n') {
                counter++;
            }
        }
        System.out.println("Counter: " + counter);

//======================================================================================================================

        String newName = name.replace('n', 'N');
        System.out.println(newName);

//======================================================================================================================

        String nickName = name.substring(0, 2); // ( inclusive of index 0 , exclusive of index 2) ;
        System.out.println(nickName);
        System.out.println(nickName.toUpperCase());

//======================================================================================================================

        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        name = "Ted";
        System.out.println(name); // prints Ted. String name = "Ted" will not be allowed. Already defined.

//======================================================================================================================

//        Get rid of the () and - from a phone number format, keep only a String with just the numbers, then grab only the area code (the first 3 digits).
        Scanner scan = new Scanner(System.in);
        String userPhoneNumber;
//        Input:
        System.out.println("Type in your phone number:");
        userPhoneNumber = scan.nextLine();
        System.out.println(userPhoneNumber.replaceAll("[\\D]", "") + " area code: " + userPhoneNumber.substring(1, 4));
//        \D represents a character that is not a digit. replaceAll with an empty

//                Example
//        (210) 123-4560
//        Output:
//        2101234560, area code: 210

    }
}
