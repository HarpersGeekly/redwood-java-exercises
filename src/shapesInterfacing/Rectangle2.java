package shapesInterfacing;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class Rectangle2 extends Quadrilateral implements Measurable {

    public Rectangle2(double length, double width) {
        super(length, width); // uses the parent constructor (Quadrilateral)
    }

    //=========== Overridden abstract methods from the Quadrilateral abstract class. Now they are further defined =======================
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
}
