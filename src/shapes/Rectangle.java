package shapes;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class Rectangle {


    protected double length; //Protected = a version of public restricted only to subclasses. Can be seen by subclasses or package member.
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
//        return area;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);

    }

}

//Shapes
//        Inside of your shapes directory, create a class named Rectanlge. It should have private properties for both length and width.
// Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//        perimeter = 2 x length + 2 x width
//        area = length x width


