/**
 * Created by RyanHarper on 9/21/17.
 */
public class MethodsLecture {

    public static void main(String[] args) {

        System.out.println(add(4, 4)); // add() method can also be called in sayHello() method.
        sayHello("Ryan", 32); // At first it won't allow you to have a non-static method on a static method. Go down and add static to sayHello method!
        sayHello("Grant", "070689"); // same method, different parameters.
        sayHello();

//        for(int i = 0; i <= 10; i++){
//            System.out.println("i = " + i);
//        }
//      let's emulate the for loop a different way (not a popular way) with recursion:
        counter(0);

    }
// ================================= Method's and Method Overloading ===================================================

    // each method is independent outside the main...
    // you specify the datatypes in parameter
    // void = no return. no void = return.

    public static int add(int x, int y) {
        return x + y;
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + " age: " + age);
    }

    public static void sayHello(String name, String dob) {
        System.out.println("Hello " + name + " dob: " + dob);
    }

    public static void sayHello() {
        System.out.println("Hi there.");
    }

    // same name is method overload. But as long as you have different parameters it will be different.
    // also if you have the same datatypes in the parameters but different order, it will work too, but not a big deal to think about.

//think back to movie list app:
// getMovie(int id);
// getMovie();

// =====================================    Recursion     ==============================================================
// call a method inside a method.

    public static void counter(int i) {
        System.out.println("i = " + i);
        i++;

        if(i == 10) {
            return;
        }
        counter(i);
    }


}

