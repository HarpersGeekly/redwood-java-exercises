package fileHandling;

import validator.Validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RyanHarper on 10/4/17.
 */
public class FilesLecture {
    public static void main(String[] args) throws IOException {
//        Path directory = Paths.get("resources"); // directories
        Path path = Paths.get("resources", "info.txt");

        // create a path with a directory "resources", and a file "info.txt", if they don't exist, have Java create it for me:

        if (!Files.exists(path.getParent())) {
            Files.createDirectory(path.getParent());
        }
        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        // helper methods / static methods
        // write to a file:

//        List<String> groceries = Arrays.asList("coffee,3", "tea,4", "sugar,2");
        //same as:
        List<String> groceries = new ArrayList<>();
        groceries.add("coffee, 3");
        groceries.add("tea, 4");
        groceries.add("sugar, 2");

        Validator validator = new Validator();
        String groceryItem = validator.getString("What do you need at the grocery store?");
        int quantity = validator.getInt("How many do you need?");
        groceries.add(groceryItem + ", " +  quantity);

//        Files.write(path, groceries);
        Files.write(path, groceries, StandardOpenOption.APPEND); // write several lines to a file

        List<String> mySavedGroceries = Files.readAllLines(path); // read all the lines from a file

        for (String grocery: mySavedGroceries) {
            String[] parts = grocery.split(",");
            System.out.println("Item: " + parts[0] + " , Quantity: " + parts[1]);

//            System.out.println(grocery);
        }
        System.out.println(path.toAbsolutePath());
    }
}
// manipulate information with an array, not the file.