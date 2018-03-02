package shapes;
import validator.Validator;
/**
 * Created by RyanHarper on 9/25/17.
 */
public class CircleApp {
    public static void main(String[] args) {

        Validator validator = new Validator();

        do {

            double radius = validator.getDouble("Enter radius of a circle:");

            Circle circle = new Circle(radius); // new instance of the Circle class. Now I can use all my stuff in Circle.

            System.out.println("area2: " + circle.getAreaWithoutFormat(radius));
            System.out.println("The area of your circle formatted is " + circle.getFormattedArea());
            System.out.println("The circumference of your circle is " + circle.getFormattedCircumference());
            System.out.println("Number of circles made = " + Circle.numberOfCirclesMade);

        } while (validator.yesNo("Would you like to make another circle? Y/N"));
        System.out.println("Goodbye.");

    }
}












//        Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
//        The formulas for circumference and area:
//
//        circumference = 2 x pi x radius
//        area = pi x (radius ^ 2)
//        For the value of pi, use the PI constant of the Math class.
//        Bonus
//        After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.
//        Before exiting, the program should output the total number of circles created. Use a private static property, along with a public static method to keep track of and display the total number of circles created.


