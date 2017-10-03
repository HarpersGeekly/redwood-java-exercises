package shapesInterfacing;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class Square2 extends Quadrilateral{

    public Square2(double side) {
        super(side, side);
    }

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

    public double getPerimeter() {
        System.out.println("Square.getPerimeter:");
        return super.getWidth() * 4;
//        return this.side * 4;
    }

    public double getArea() {
        System.out.println("Square.getArea:");
        return super.getWidth() * super.getLength();
//
    }
}
