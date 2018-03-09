package studentGrades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by RyanHarper on 10/2/17.
 */
public class Student {

    private String name;
    private ArrayList<Double> grades;
    private HashMap<String, String> attendance;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student ryan = new Student("Ryan");
        Student grant = new Student("Grant");

        ryan.addGrade(95.6);
        ryan.addGrade(85.7);
        ryan.addGrade(75.6);
        grant.addGrade(99.5);
        grant.addGrade(87.5);
        grant.addGrade(97.3);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(ryan.getName() + "'s average grade is: " + df.format(ryan.getGradeAverage()));
        System.out.println(grant.getName() + "'s average grade is: " + df.format(grant.getGradeAverage()));


    }


}

//Exercises
//
//        Create an application for tracking student grades
//
//        For this exercise, create a directory inside of src named grades. Create the classes defined below inside of grades.
//
//        Create a Student class
//Create a class named Student. It should have private properties for the student's name, and grades.
// The grades property should be an list of integers. The student class should have a constructor that sets name property,
// and initializes the grades property as an empty list. The Student class should have the following methods:
//
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();
//        Test your Student class by adding a main method and creating Student objects.
// Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.

