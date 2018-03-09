package studentGrades;

import validator.Validator;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by RyanHarper on 10/2/17.
 */
public class GradesApplication {

    static Validator validator = new Validator();
    static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student tyler = new Student("Tyler Hinton");
        Student brad = new Student("Brad Goode");
        Student ryan = new Student("Ryan Harper");
        Student gideon = new Student("Gideon Rogers");

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
            viewMenu(students);
        } while (validator.yesNo("Back to Menu? Y/N"));
        System.out.println("Goodbye.");
        System.exit(0);

    } //<<< END OF MAIN METHOD =========================================================================================

    public static void viewMenu(HashMap<String, Student> students) {

        System.out.println("===========================");
        System.out.println("What would you like to do? ");
        System.out.println("===========================");
        System.out.println("[1] Choose Student");
        System.out.println("[2] View Class Report");
        System.out.println("[3] View Class Average");
        System.out.println("[4] Exit");

        int userInput = validator.getIntWithinRange("Enter an option:", 1, 4);

        switch (userInput) {
            case 1:
                viewStudent(students);
                break;
            case 2:
                viewAllStudents(students);
                break;
            case 3:
                viewClassAverage(students);
                break;
            case 4:
                System.out.println("Goodbye.");
                System.exit(4);
                break;
            default:
                break;
        }
    }

    public static void viewStudent(HashMap<String, Student> students) {

        for (String username : students.keySet()) {
            // for each String username in the students collection
            System.out.println(username);
        }

        String userSelect = validator.getString("\n======== What student would you like to see more information on? ========");

        if (students.containsKey(userSelect)) {
            System.out.println("GitHub Username " + userSelect + "'s real name is: " + students.get(userSelect).getName());
            System.out.println(userSelect + "'s grades are: " + students.get(userSelect).getGrades());
            System.out.println(userSelect + "'s average grade is: " + df.format(students.get(userSelect).getGradeAverage()));
        } else {
            System.out.println("Sorry, no username with name " + userSelect + " exists.");
            viewStudent(students);
        }
    }

    public static void viewAllStudents(HashMap<String, Student> students) {
        for (String username : students.keySet()) {
            Student curStudent = students.get(username);
            System.out.println("GitHub Username: " + username + " | Name: " + curStudent.getName() + " | Average Grade: " + df.format(curStudent.getGradeAverage()));
        }
    }

    public static void viewClassAverage(HashMap<String, Student> students) {

        ArrayList<Double> grades = new ArrayList<>();

        // Loop through HashMap and acquire the average for each student. Take that grade and place it in a list:
        for(Student student : students.values()) {
            double averagePerStudent = student.getGradeAverage();
            grades.add(averagePerStudent);
        }

        // Loop through each grade in the grades array and add them together:
        double result = 0;
        for(double grade : grades) {
            result += grade;
        }

        // Take the result and divide by number of students. Print the final class average with decimal format.
        double classAverage = result / grades.size();
        System.out.println("Class average = " + df.format(classAverage));
        }
    }
//
//    **Bonus**
//
//    If you are done...

//            - Add an attendance property to your Student objects. It should be a
//    HashMap<String, String>. The keys should be strings representing the date,
//    in the format "2017-10-02", and the values should be Strings that are one
//    of:
//            - "A": Absent
//        - "P": Present
//
//        - Add a method named `recordAttendance(String date, String value)` that
//    adds records to the HashMap this method should make sure `value` is an
//    an acceptable string (else { callMethodAgain()}
//        - Create an instance method on your Student class to calculate a
//            student's attendance percentage -- (Total Days - Absences) / Total Days
//            - Add the attendance information to the output of your command line
//    interface, this should require only a small change
//        - Create an instance method on Student that finds the specific days a
//    student was absent. This method should return a List of Strings, where
//    each string is the date of the absence
//



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