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


}


