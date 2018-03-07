package shapesInterfacing;

/**
 * Created by RyanHarper on 9/28/17.
 */
public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    //=========== Overridden methods from Measurable interface. Now they are further defined =======================
    @Override
    public double getPerimeter() {
        return length * width;
    }

    @Override
    public double getArea()  {
        return (2 * length) + (2 * width);
    }
}
