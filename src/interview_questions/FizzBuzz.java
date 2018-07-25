package interview_questions;
import java.util.stream.IntStream;

/**
 * Created by RyanHarper on 1/4/17.
 */
public class FizzBuzz {
    public static void main(String[] args) {

//        One of the most common interview questions for entry-level programmers is the interview_questions.FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number.
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “interview_questions.FizzBuzz”.

        System.out.println("============== myFizzBuzz========");
        myFizzBuzz(100);

        System.out.println("============== myFizzBuzz Java 8========");
        myFizzBuzzJava8(100);

        System.out.println("============== myFizzBuzz Java 8 again========");
        myFizzBuzzJava8again(100);

    }

    public static void myFizzBuzz(int max) {
        int x;
        for (x = 1; x <= max; x++) {
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(x);
        }
    }

    public static void myFizzBuzzJava8(int max) {
        IntStream.range(1, max + 1)
            .mapToObj(n -> {
            if (n % 15 == 0) return "FizzBuzz";
            else if (n % 3 == 0) return "Fizz";
            else if (n % 5 == 0) return "Buzz";
            else return n;
        }).forEach(System.out::println);
    }

// The first step is to get a stream of the numbers from 1 to 100. This is done by calling
// IntStream.range(1, 101). The second argument is exclusive, so to get 1 to 100 we need to specify 101 as the end value.

// Once we have a stream, we can do a map operation. Since this is an IntStream, but the desired output is Strings,
// we can use IntStream's mapToObj method to do the conversion. If we used the standard map method, we'd get a compile
// error because of an incompatible return type.

// The mapToObj method expects a lambda expression. It will apply the lambda to each item in the stream
// (the numbers from 1 to 100), and return a new stream of the mapped values. In this case, the mapping is
// straightforward. We check if the number is divisible by 3, 5, or 15 (both 3 and 5) and return the appropriate value.

// To print the results to the console, we use another new Java 8 feature: method references.
// After mapping the stream, we want to print each item. For this we'll use forEach. Instead of a lambda expression,
// like we used with mapToObj, we'll pass a method reference to System.out.println. The syntax is System.out::println.
// Reminds me of C++!

// This is a very simple example, but I hope it demonstrates the power of lambda expressions.

// http://www.thinksincode.com/2014/03/19/functional-fizzbuzz-with-java-8-streams.html

    public static void myFizzBuzzJava8again(int max) {
    IntStream.range(1, max + 1)
            .boxed()
        .map(x -> x + ": " + (x % 3 == 0 ? "Fizz": "") + (x % 5 == 0 ? "Buzz": ""))
            .forEach(System.out::println);
    }

}


