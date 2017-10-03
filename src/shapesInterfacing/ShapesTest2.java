package shapesInterfacing;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class ShapesTest2 {
    public static void main(String[] args) {



        System.out.println("================ Rectangle ====================");

        Measurable myShape = new Rectangle2(20, 11);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("================ Square =======================");

        Measurable myShape2 = new Square2(4);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());


//                myShape = new Quadrilateral(5, 4);  is abstract. can't be instantiated!
//
//        System.out.println("area: " + myShape.getArea());
//        System.out.println("perimeter: " + myShape.getPerimeter());


    }
}
