package java101;

import java.util.Scanner;
/**
 * Created by RyanHarper on 9/18/17.
 */
public class IO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("What is your name?");
        String userName;
        userName = scan.nextLine();
//        System.out.println(userName);

        System.out.printf("What is your age?");
        byte userAge = scan.nextByte();
//        System.out.println(userAge);

        System.out.println("Hello, " + userName + ". You are " + userAge + " years old.");
    }

}
