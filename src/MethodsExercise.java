/**
 * Created by RyanHarper on 9/21/17.
 */
public class MethodsExercise {
//        Create a class named MethodsExercises. Inside of your class, write a code to create the specified methods.
//        Test your code by creating a main method and calling each of the methods you've created.

    public static void main(String[] args) {


        System.out.println(addition(2, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(2, 2));
        System.out.println(division(15, 3));
        System.out.println(modulus(12, 5));
        System.out.println(multiply(5, 5));
        System.out.println(multiply(3, -11));
    }

//  =====================================   Basic Arithmetic   ========================================= Static Methods
//        Create four separate methods. Each will perform an arithmetic operation:
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//        Test your functions and verify the output.


    //        Addition
    public static int addition(int x, int y) {
        return x + y;
    }

    //        Subtraction
    public static int subtraction(int x, int y) {
        return x - y;
    }

    //        Multiplication
    public static int multiplication(int x, int y) {
        return x * y;
    }

    //        Division
    public static int division(int x, int y) {
        return x / y;
    }

    //        Add a modulus function that finds the modulus of two numbers.
//   Modulus
    public static int modulus(int x, int y) {
        return x % y;
    }
//        Food for thought: What happens if we try to divide by zero? What should happen?
    // the internet explodes.
    // Exception in thread "main" java.lang.ArithmeticException: / by zero

// =========================================   Bonus  ==================================================================
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.


    public static int multiply(int x, int y) {
   // 0  multiplied with anything gives 0
        if (y == 0) {
            return 0;
        }
   // Add x one by one
        if (y > 0) {
            return (x + multiply(x, y - 1));
        }
  // the case where y is negative
        if (y < 0) {
            return -multiply(x, -y);
        }
        return multiply(x, y);
    }
}
//======================================================================================================================





