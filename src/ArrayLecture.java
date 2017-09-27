import Validator.Validator;

import java.util.Arrays;

/**
 * Created by RyanHarper on 9/26/17.
 */
public class ArrayLecture {
    public static void main(String[] args) {

        double[] prices = new double[4];

// zero based index:

        prices[0] = 12.50;
        prices[1] = 15.49;
        prices[2] = 17.99;
        prices[3] = 19.99;

        System.out.println(prices.length);


        // ==== Object Arrays ================

        Person[] person = new Person[2];

        person[0] = new Person("dude");
        person[1] = new Person("bro");

        for(Person p : person) {
            System.out.println(p.getName());
        }


        // ===== Array initialization =========

        int[] numbers = new int[]{
                1,2,3,4,5
        };

        // classic
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // enhanced for loop
        for(int number : numbers){
            System.out.println(number);
        }

//      ================================================================================================================
        Validator validator = new Validator();

        int sizeOfArray = validator.getInt("How many things are you going to have for lunch?");

        String[] foods = new String[sizeOfArray];

        for(int i= 0; i < sizeOfArray; i++){
            System.out.println();
            foods[i] = validator.getString("Enter the item at index " + i + ": ");
        }
        System.out.println("There are " + foods.length + " items in the array.");


        System.out.println("=========  Using Arrays.toString(foods) ============ ");
        System.out.println("You are eating " + Arrays.toString(foods) + " for lunch.");

        System.out.println("=========  Using enhanced for loop ==================");
        // enhanced for loop
        for(String food : foods){
            System.out.println("You are eating " + food + " for lunch.");
        }

//      ========================== Two-dimensional Array ===============================================================

        // must be in a method. Here, it's in the main method. But it has to be in a method.
        // an array of array's, commonly known as a matrix.
        // can be thought of as a grid.

        int[][] matrix = {
                {1, 2, 3}, //array[0]
                {4, 5, 6}, //array[1]
                {7, 8, 9},  //array[2]
                {10, 11, 12}, //array[3]
        };
        System.out.println(matrix[1][2]); // 6, why? [1] = index of the array, [2] = index of the element.

        System.out.println(Arrays.toString(matrix));

            // you probably need nested loops to print everything out in a two-dimensional array, and recommended enhanced loop:

        int counter = 0; // helps us keep track of the looping...for demo purposes.

        for(int[] number : matrix){
            counter++;
                System.out.println(number[1]);
            //loops through the matrix and prints out all the indexes at [1]
            if (counter == 4) {
                number[1] = 20; // changes the index value on that counted row to 20.
                System.out.println(number[1]);
                // loops through the matrix and prints out only that final index = 20.
            }
        }

        // from curriculum. building the rows.
        for (int[] row : matrix) {

            System.out.println("+---+---+---+");
            System.out.print("| ");

            for (int col : row) {

                System.out.print(col + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

    }
}
