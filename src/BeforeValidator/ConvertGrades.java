package BeforeValidator;

import java.util.Scanner;


/**
 * Created by RyanHarper on 9/19/17.
 */
public class ConvertGrades {
    public static void main(String[] args) {

//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.

        Scanner scan = new Scanner(System.in);
        String userWantsToContinue;
        int grade;
        String message;

        do {

            System.out.println("What is the student's grade between 0 and 100?");
            grade = scan.nextInt();

//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 60 - 0

//        Display the corresponding letter grade.
            if (grade >= 88) {
                message = "Student made an A";
            } else if (grade >= 80) {
                message = "Student made a B";
            } else if (grade >= 67) {
                message = "Student made a C";
            } else if (grade >= 60) {
                message = "Student made a D";
            } else
                message = "Student made an F";
            System.out.println(message);


//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.

            System.out.println("Do you want to grade another student?");
            userWantsToContinue = scan.next();
        } while (userWantsToContinue.equalsIgnoreCase("Yes")
                || userWantsToContinue.equalsIgnoreCase("Y"));

                System.out.println("Good Luck out there, Teach!");

//      Another way to be more specific but it also makes it easy to break. IE someone who types in 102 gets an F.
//        if (grade <= 100 && grade >= 88) {
//            message = "Student made an A";
//        } else if (grade <= 87 && grade >= 80) {
//            message = "Student made a B";
//        } else if (grade <= 79 && grade >= 67) {
//            message = "Student made a C";
//        } else if (grade <= 66 && grade >= 60) {
//            message = "Student made a D";
//        } else
//            message = "Student made an F";
//        System.out.println(message);

    }
}
