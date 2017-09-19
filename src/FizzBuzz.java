

/**
 * Created by RyanHarper on 1/4/17.
 */
public class FizzBuzz {
    public static void main(String[] args) {

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number.
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                if (x % 3 == 0) {
                    System.out.println("Fizz");
                }
                if (x % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(x);
                }
            }
        }
    }
}

