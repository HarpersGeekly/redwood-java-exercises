package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {

        // ============================ PATH

        Path fileLecturePath = Paths.get("src/fileHandling", "FileIOLecture.java");

        System.out.println(fileLecturePath);
        System.out.println(fileLecturePath.toAbsolutePath());
//
//    Path otherPath = Paths.get("src", "../", "src", "../", "src", "FileIOLecture");
//    System.out.println(otherPath);
//    System.out.println(otherPath.normalize());
//    System.out.println(otherPath.normalize().toAbsolutePath());
//    System.out.println(otherPath.toAbsolutePath());

        // ============================ FILE METHODS

            System.out.println(Files.exists(fileLecturePath));
            System.out.println(Files.exists(Paths.get("bob.txt")));

            String directory = "data";
            String filename = "info.txt";
            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            if (!Files.isDirectory(dataDirectory)) {
                try {
                    Files.createDirectories(dataDirectory);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!Files.exists(dataFile)) {
                try {
                    Files.createFile(dataFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        // ============================ READING FILES

        try {
            List<String> contents = Files.readAllLines(
                    Paths.get("data", "bob.txt") // doesn't exist = NoSuchFileException
            );
        } catch (Exception e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }

            try {
                List<String> contents = Files.readAllLines(Paths.get("data/info.txt"));
                System.out.println(contents.toString()); // shows an empty Array at first...
            } catch (IOException e) {
                System.out.println("Exception!");
                e.printStackTrace();
            }


        // ============================ WRITING FILES

            List<String> names = new ArrayList<>();
            names.add("Tim");
            names.add("Sally");
            names.add("Mary");
            try {
                Files.write(dataFile, names, StandardOpenOption.APPEND);
            } catch(IOException e) {
                e.printStackTrace();
            }
//
//            String directory = "data";
//            String filename = "info.txt";
//            Path dataDirectory = Paths.get(directory);
//            Path dataFile = Paths.get(directory, filename);
//
            List<String> nums = new ArrayList<>();
            nums.add("1");
            nums.add("2");
            nums.add("3");

            try {
                Files.write(dataFile, nums, StandardOpenOption.APPEND);
            } catch(IOException e) {
                System.out.println("Exception!!!");
                e.printStackTrace();
            }

        // ============================ ADDITIONAL SLIDE EXAMPLES


        // Print out each line in an existing file, along with the line number

        Path groceriesPath = Paths.get("data", "items.txt");
        List<String> groceryList = null;
        try {
            groceryList = Files.readAllLines(groceriesPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        // Add a line to an existing file

        try {
            Files.write(
                Paths.get("data", "items.txt"),
                Arrays.asList("eggs"), // list with one item
                StandardOpenOption.APPEND
//                StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Replace "milk" with "cream"

        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("data", "items.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }

        try {
            Files.write(Paths.get("data", "items.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}