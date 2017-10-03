package shapes;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class ShapesTest {
    public static void main(String[] args) {

        System.out.println("============== Rectangle box1 ================");
//        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(4, 5);
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println(box1.getPerimeter()); // 18
        System.out.println(box1.getArea()); // 20

        System.out.println("============== Rectangle box2 ================");
//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(12);
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println(box2.getPerimeter()); // 20
        System.out.println(box2.getArea()); //25

        System.out.println("============== Rectangle box3 ================");
        Rectangle box3 = new Square(9);
        System.out.println(box3.getPerimeter()); // 20
        System.out.println(box3.getArea()); //25

        //lets make a list...
        System.out.println("=========== Array ====== ");
        Rectangle[] recs = {box1, box2, box3};

        for(Rectangle r: recs) {
            System.out.println(r.getPerimeter());
            System.out.println(r.getArea());
        }

        System.out.println("=========================");
        Rectangle rectangle = new Rectangle(20,40);
        showRectangleInfo(rectangle);
    }

    // BONUS: create a static method named 'showRectangleInfo' that accepts an object of Type 'Rectangle' and displays the area and perimeter.
    public static void showRectangleInfo(Rectangle rectangle) {
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter() + " and the area is: " + rectangle.getArea());
    }

}


