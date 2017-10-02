package studentGrades;

import validator.Validator;
import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * Created by RyanHarper on 10/2/17.
 */
public class GradesApplication {

        static Validator validator = new Validator();
        static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student tyler = new Student("Tyler");
        Student brad = new Student("Brad");
        Student ryan = new Student("Ryan");
        Student gideon = new Student("Gideon");

        tyler.addGrade(90.1);
        tyler.addGrade(96.3);
        tyler.addGrade(85.7);
        brad.addGrade(87.5);
        brad.addGrade(97.7);
        brad.addGrade(90.2);
        ryan.addGrade(75.9);
        ryan.addGrade(89.2);
        ryan.addGrade(93.5);
        gideon.addGrade(98.4);
        gideon.addGrade(91.5);
        gideon.addGrade(80.3);

        // students.put(String username, Student object) puts them into the "students" HashMap.
        students.put("GreatGrandma", tyler);
        students.put("Bradzor", brad);
        students.put("HarpersGeekly", ryan);
        students.put("SeouledOut", gideon);

        do {

            System.out.println("=========================== List of GitHub UserNames =====================================\n");

            viewMenu(students);

            String userSelect = validator.getString("\n======== What student would you like to see more information on? ========");

            if (students.containsKey(userSelect)) {
                System.out.println("GitHub Username " + userSelect + "'s real name is: " + students.get(userSelect).getName());
                System.out.println(userSelect + "'s average grade is: " + df.format(students.get(userSelect).getGradeAverage()));

            } else if (userSelect.contains("View")) {
                viewAllStudents(students);

            } else {
                System.out.println("Sorry, no username with name " + userSelect + " exists.");
            }

            System.out.println("Enter another student? Y/N");
        } while (validator.yesNo());
        System.out.println("Goodbye.");

    } // END OF MAIN METHOD ============================================================================================

    public static void viewMenu(HashMap<String, Student> students) {
        for (String usernames : students.keySet()) {
            // for each String usernames in the students collection
            System.out.print(" | " + usernames + " | ");
        }
        System.out.print("View All\n");
    }
    public static void viewAllStudents(HashMap<String, Student> students) {
        for(String usernames : students.keySet()) {
            Student curStudent = students.get(usernames);
            System.out.println("GitHub Username: " + usernames + " | Name: " + curStudent.getName() + " | Average Grade: " + df.format(curStudent.getGradeAverage()));
        }
    }
}




//        ===== Create a map for students and Github usernames =========
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
// It should have keys that are strings that represent github usernames, and values that are Student objects.

// Create at least 4 student objects with at least 3 grades each, and add them to the map.
//        Be creative! Make up github usernames and grades for your student objects.

//        Create the command line interface
//Print the list of github usernames out to the console, and ask the user which student they would like to see more information about.
// The user should enter a github username (i.e. one of the keys in your map). If the given input does not match up with a key in your map,
// tell the user that no users with that username were found. If the given username does exist, display information about that student,
// including their name and their grades.
//        After the information is displayed, the application should ask the user if they want to continue,
// and keep running so long as the answer is yes.
//        Example output:
//
//
//        Welcome!
//
//        Here are the github usernames of our students:
//
//        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
//
//        What student would you like to see more information on?
//
//        > pizza
//
//        Sorry, no student found with the gihub username of "pizza".
//
//        Would you like to see another student?
//
//        > y
//
//        What student would you like to see more information on?
//
//        > zgulde
//
//        Name: Zach - Gihub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//        > no
//
//        Goodbye, and have a wonderful day!
//        Bonus
//
//        Display all of the student's grades in addition to the grade average
//        Allow the user to view all of the grades for all of the students



//                for (Student student : students.values()) {
//
////                    for(String usernames : students.keySet()) {
////                        Student currentStudent = students.get(usernames);
//                    // for each String username in the students.keySet() collection
////                        System.out.print("GitHub Username: " + usernames);
////                    }
////                    System.out.println("Github Username: " + students.get(usernames)    );
//                    System.out.println("Name: " + student.getName());
//                    System.out.println("Average Grade: " + df.format(student.getGradeAverage()));
//                    System.out.println("==========================");
//                }
