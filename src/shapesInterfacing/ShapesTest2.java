package shapesInterfacing;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class ShapesTest2 {
    public static void main(String[] args) {

        System.out.println("================ Rectangle ====================");

        Measurable myShape = new Rectangle2(20, 11);
        System.out.println("area: " + myShape.getArea());
        System.out.println("perimeter: " + myShape.getPerimeter());

        System.out.println("================ Square =======================");

        Measurable myShape2 = new Square2(4);
        System.out.println("area: " + myShape2.getArea());
        System.out.println("perimeter: " + myShape2.getPerimeter());

//      Measurable myShape = new Quadrilateral(5, 4);  is abstract. can't be instantiated!
//      Measurable myShape = new Measurable(); is abstract can't be instantiated

//        Q. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//            A: Because Rectangle implements the Measurable interface that requires that method.

//        Q. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//            A: Can't be resolved because myShape is restricted to using only the methods in the interface
//               that are further defined by the myshape = new Class().

    }
}
