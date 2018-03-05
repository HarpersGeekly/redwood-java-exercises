package java101;

/**
 * Created by RyanHarper on 9/18/17.
 */
public class SyntaxExercise1 {
    public static void main(String[] args) {

//    Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        // type, identifier, assignment, value.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

//    Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "My name is Ryan";
        System.out.println(myString);

//    Change your code to assign a character value to myString. What do you notice?
//        String myString ='L'; // error: required a String, found a char
//    Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159; // same thing, but found a double

//    Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber); //error: var myNumber might not have been initialized

//    Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14; //error: required long found a double
//    Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L; // works because it knows it's a long number with 'L' at the end. Always provide the L for long.
//    Change your code to assign the value 123 to myNumber.
//        long myNumber = 123; // works because int's can still be a long.
//    Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //long's are integers, they aren't floating point numbers like doubles are.
//    Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber = 3.14f; // at first it's an error, it wants a float but I gave it a double. Fixed by putting an 'f' at the end.

//    Copy and paste the following code blocks one at a time and execute them:
//
//    int x = 5;
//System.out.println(x++); // prints 5, but stores one more for x...
//System.out.println(x); // so that from now on x = 6.

//    int x = 5;
//System.out.println(++x); // adds one more to 5 and ends with x = 6
//System.out.println(x); // prints x = 6
//    What is the difference between the above code blocks? Explain why the code outputs what it does. See above comments.


//    Try to create a variable named class. What happens?
//        String class;
//        "class" is a reserved word in the java language. You can't use reserved words as identifiers.

//    Rewrite the following expressions using the relevant shorthand assignment operators:

//    int x = 4;
//    x = x + 5;
//       shorthand: x += 5;
//
//    int x = 3;
//    int y = 4;
//    y = y * x;
        //shorthand: y *= x;
//
//    int x = 10;
//    int y = 2;
//    x = x / y;
//    y = y - x;
        //shorthand: x /= y;
        //shorthand: y -= x;
    }
}

