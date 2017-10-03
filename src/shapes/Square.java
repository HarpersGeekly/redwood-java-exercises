package shapes;

/**
 * Created by RyanHarper on 9/28/17.
 */
// Create a class named Square, also inside of shapes, that extends Rectangle.
// Square should define a constructor that accepts one argument, side,
// and calls the parent's constructor to set both the length and width to the value of side.
public class Square extends Rectangle {
//    private double side;

    public Square(double side) {
        super(side, side); // calling the superclass constructor and following the number of parameters.
        // a rectangle has different length and width but a square has one side...we're creating a rectangle that looks like a square.
//        this.side = side; // initializes the side to be used for the methods.
    }

// override the getArea and getPerimeter methods with the following definitions for a square:
//        perimeter = 4 x side
//        area = side ^ 2
    public double getArea() {
        System.out.println("Square.getArea:");
        return super.getWidth() * super.getLength();
//        return this.side * this.side;
    }

    public double getPerimeter() {
        System.out.println("Square.getPerimeter:");
        return super.getWidth() * 4;
//        return this.side * 4;
    }
// Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
    // You can't. But you can sout...

}

