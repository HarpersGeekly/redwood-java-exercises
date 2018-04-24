package interview_questions;

import java.util.Optional;

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

        System.out.println("============== fizzBuzzJava8 ========");
        System.out.println(fizzBuzzInJava8(100));

        System.out.println("============== fizzBuzzJava8longer ========");
        System.out.println(fizzBuzzSolutionJava8(100));

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

    public static String fizzBuzzInJava8(int number) {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    public static String fizzBuzzSolutionJava8(int input) {
        return Optional.of(input)
                .map(i -> {
                    if (i % (3 * 5) == 0) {
                        return "FizzBuzz";
                    } else if (i % 3 == 0) {
                        return "Fizz";
                    } else if (i % 5 == 0) {
                        return "Buzz";
                    } else {
                        return Integer.toString(i);
                    }
                }).get();
    }
}


