package validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RyanHarper on 10/4/17.
 */
public class FileHandler {

    private String directory; // > "directory"
    private String filename; // ^ "info.txt"
    private Path directoryPath;
    private Path filePath;

    public String getDirectory() {
        return directory;
    }
    public String getFileName() {
        return filename;
    }

    //constructor1:
    public FileHandler(String directory, String filename) {
        this.directory = directory;
        this.filename = filename;

        this.directoryPath = Paths.get(directory);
        this.createDirectoryIfNotExist();

        this.filePath = Paths.get(directory, filename);
        this.createFileIfNotExist();
    }
    //constructor2:
    public FileHandler(String filename) {
        this.filename = filename;
        this.createFileIfNotExist();
        this.filePath = Paths.get(filename);
    }

//    ================   1. Create a method to create the file if it does not exist. ===================================

    private boolean createFileIfNotExist() {

        try {
            if (!Files.exists(this.filePath)) {
                Files.createFile(this.filePath);
            }
        }catch (IOException e){
            return false;
        }
        return true;
    }

//   =================  2. Create a method to create the directory if it does not exist. ===============================

    private boolean createDirectoryIfNotExist() {

        try {
            if (!Files.exists(this.directoryPath)) {
                Files.createDirectory(this.directoryPath);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

//   ==================  3. Create a method for retrieving file contents as a List of Strings. =========================

    public List<String> retrieveFileContents() {

        try {
            return Files.readAllLines(Paths.get(directory, filename));
        } catch (IOException e) {
            return null;
        }
    }

//  ===================  4. Create a method to write (append) new contents to a file. ==================================
// This method could have an optional parameter to choose between appending the contents of the file or not.

    public boolean writeToFile(List<String> contents) {

        try {
            Files.write(Paths.get(directory, filename), contents /*StandardOpenOption.APPEND*/);
        } catch(IOException e) {
            return false;
        }
        return true;
    }

//  =================== 5. Create a method that will uppercase every line, and add a "!" to the end of every line. =====

    public void makeExciting() {

        List<String> contents = retrieveFileContents();
        for (String content : contents) {
            String exclaim = "!";
            String exciting = content.toUpperCase().concat(exclaim);
            System.out.println(exciting);
        }
    }


    //        Create a method named slurp, it takes a string that is the filepath, and returns a list of strings (the file contents).
//
//        List<String> slurp(String filepath)

    //        Create a method named spit, it should accept a filename, and a list of strings that are the contents of the file. It should also accept an optional third boolean argument that is whether or not to append to the file. This method should create the file if it doesn't already exist.
//
//        public void spit(String filename, List<String> contents, boolean append) {

//        }




}


//
//### Files exercise
//
//        Create a `FileHandler` class in the `util` package, we will use this class to handle all kinds of file operations.
// The class should have 2 private properties: directory, filename, don't forget to handle the exceptions.
//
//        1. Create a method to create the file if it does not exist.
//        2. Create a method to create the directory if it does not exist.
//        3. Create a method for retrieving file contents as a List of Strings.
//        4. Create a method to write (append) new contents to a file. This method could have an optional parameter to choose between appending the contents of the file or not.
//
//        Create a FileHandlerTest class so you can test your new class.


//    Create a class named FileHelper inside of util, it should contain the static methods defined below, and should handle any exceptions (i.e. there should not be a throws in either method signature).
//
//        For both methods, if an error is encountered, print out a message explaining what went wrong, then exit the program with the line of code below:
//
//        System.exit(1);
//        Create a method named spit, it should accept a filename, and a list of strings that are the contents of the file. It should also accept an optional third boolean argument that is whether or not to append to the file. This method should create the file if it doesn't already exist.
//
//        void spit(String filename, List<String> contents[, boolean append])

//        Write some code that tests both of the methods above by calling them, and checking for the expected result. You might want to create some test files to test these methods as well.
//
//        Create a method named makeExciting. It should accept a string that is a filepath, and uppercase every line, and add a "!" to the end of every line. Test this method by creating a test file and calling your method and passing the path of your test file.
//
//        void makeExciting(String filename)
//        Bonus
//
//        Refactor the error handling in both your methods to instead throw a RuntimeException instead of exiting. What is a benefit of this approach?
//
//        Research how to copy and move files with java, then add the following methods to your FileHelper class:
//
//        void copy(String originalFile, String copyName);
//        void move(String oldPath, String newPath);