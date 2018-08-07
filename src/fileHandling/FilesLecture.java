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
        Path path = Paths.get("resources", "groceries.txt");

        // create a path manually in IntelliJ with a directory "resources", and a file "groceries.txt",
        // Or have Java create it if they don't exist:

        if (!Files.exists(path.getParent())) {
            Files.createDirectory(path.getParent());
        }
        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        // helper methods / static methods
        // write to a file:

//        List<String> groceries = Arrays.asList("coffee,3", "tea,4", "sugar,2");
        List<String> groceries = new ArrayList<>();
        Validator validator = new Validator();

        do {
            System.out.println("Current Grocery List: " + Files.readAllLines(path)); // read all the lines from a file
            String groceryItem = validator.getString("What do you need at the grocery store?");
            int quantity = validator.getInt("How many do you need?");

            groceries.add(groceryItem + ", " + quantity);

        } while (validator.yesNo("Add another item? Y/N"));

        try {
//          Files.write(path, groceries);
            Files.write(path, groceries, StandardOpenOption.APPEND); // write several lines to a file
        } catch(IOException e) {
            e.printStackTrace();
        }

        List<String> mySavedGroceries = Files.readAllLines(path);

        for (String grocery: mySavedGroceries) {
            String[] parts = grocery.split(",");
            System.out.println("Item: " + parts[0] + " x" + parts[1]);
            }
        System.out.println(path.toAbsolutePath());
    }
}