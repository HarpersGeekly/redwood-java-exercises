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
        System.out.println("length: " + box1.getLength() + " ft");
        System.out.println("width: " + box1.getWidth() + " ft");
        System.out.println("Perimeter: " + box1.getPerimeter() + " ft"); // 18
        System.out.println("Area: " + box1.getArea() + " sqft"); // 20

        System.out.println("============== Rectangle box2 ================");
//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println("length: " + box2.getLength() + " ft");
        System.out.println("width: " + box2.getWidth() + " ft");
        System.out.println("Perimeter: " + box2.getPerimeter() + " ft"); // 20
        System.out.println("Area: " + box2.getArea() + " sqft"); //25

        System.out.println("============== Rectangle box3 ================");
        Rectangle box3 = new Square(9);
        System.out.println("length: " + box3.getLength() + " ft");
        System.out.println("width: " + box3.getWidth() + " ft");
        System.out.println("Perimeter: " + box3.getPerimeter() + " ft"); // 36
        System.out.println("Area: " + box3.getArea() + " sqft"); //81

        //lets make a list...
        System.out.println("=========== Array ====== ");
        Rectangle[] recs = {box1, box2, box3};

        for(Rectangle r: recs) {
            System.out.println("Perimeter: " + r.getPerimeter() + " ft");
            System.out.println("Area: " + r.getArea() + " sqft");
        }

        System.out.println("===========BONUS==============");
        Rectangle rectangle = new Rectangle(20,40);
        showRectangleInfo(rectangle);
    }

    // BONUS: create a static method named 'showRectangleInfo' that accepts an object of Type 'Rectangle' and displays the area and perimeter.
    public static void showRectangleInfo(Rectangle rectangle) {
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter() + " ft and the area is: " + rectangle.getArea() + " sqft");
    }

}


