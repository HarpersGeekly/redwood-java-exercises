package shapesInterfacing;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class Square2 extends Quadrilateral{

    public Square2(double side) {
        super(side, side);
    }

//=========== Overridden abstract methods from the Quadrilateral abstract class. Now they are further defined =======================

//    Because the length of all sides of a square are the same,
//    the methods for setting the length and the width should set both protected properties.

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return super.getWidth() * 4;
//        return this.side * 4;
    }

    @Override
    public double getArea() {
        return super.getWidth() * super.getWidth();
//
    }
}
