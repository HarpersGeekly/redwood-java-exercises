/**
 * Created by RyanHarper on 9/18/17.
 */
import java.util.Scanner;

public class ConsoleIOExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        System.out.println("Enter an integer:");
        int userInt = scan.nextInt();
        System.out.println("you entered: " + userInt + ".");

//        What happens if you input something that is not an integer?
        // you get an error:
        //Exception in thread "main" java.util.InputMismatchException
//        at java.util.Scanner.throwFor(Scanner.java:864)
//        at java.util.Scanner.next(Scanner.java:1485)
//        at java.util.Scanner.nextInt(Scanner.java:2117)
//        at java.util.Scanner.nextInt(Scanner.java:2076)
//        at ConsoleExercises.main(ConsoleExercises.java:11)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
        System.out.printf("Enter three words:");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
//        What happens if you enter less than 3 words? It waits for the third word.
//        What happens if you enter more than 3 words? The words after the third word gets taken into and used as the next "souted" line.
        System.out.println("You inputted: ");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method,
//        then display that sentence back to the user:

        System.out.println("Enter a sentence");
        String userSentence = scan.next();
        System.out.println(userSentence);
//        do you capture all of the words? No, not if you use next(), it only captures the first word in the sentence.

        scan.nextLine();

//        Rewrite the above example using the .nextLine method.
        System.out.println("Enter a new sentence:");
        String userNewSentence = scan.nextLine();
        System.out.println("You typed: " + userNewSentence);

//        Calculate the perimeter and area of Codeup's classrooms
//        Prompt the user to enter values of length and width of the classroom.
        System.out.println("Enter the width of the room: ");
        double width = scan.nextDouble();
        System.out.println("Enter the length of the room: ");
        double length = scan.nextDouble();
        System.out.println("The width is " + width + " and the length is " + length);
        double perimeter = ((length * 2) + (width * 2));
        System.out.println("The perimeter is " + perimeter + " feet");

        scan.nextLine();
//        Use the .nextLine method to get user input and cast the resulting string to a numeric type.
        System.out.println("type in a number");
        int userGuess = Integer.parseInt(scan.nextLine());
        System.out.println(userGuess);

//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        Accept decimal entries
//        Display the area of tht classroom:
        System.out.println("Enter the width of the room: ");
        double widthArea = scan.nextDouble();
        System.out.println("Enter the length of the room: ");
        double lengthArea = scan.nextDouble();
        System.out.println("The width is " + widthArea + " and the length is " + lengthArea);
        double areaOfRoom = (widthArea * lengthArea);
        System.out.println("The area of the room is " + areaOfRoom + " square feet");

//        Calculate the volume of the room:

        System.out.println("Enter the width of the room: ");
        double widthVolume = scan.nextDouble();
        System.out.println("Enter the length of the room: ");
        double lengthVolume = scan.nextDouble();
        System.out.println("Enter the height of the room");
        double heightVolume = scan.nextDouble();
        System.out.println("The width is " + widthVolume + " the length is " + lengthVolume + " and the height is " + heightVolume + ".");
        double volumeOfRoom = ((widthVolume * lengthVolume) * heightVolume);
        System.out.println("The volume of the room is " + volumeOfRoom + " cubic feet" );

    }
}

