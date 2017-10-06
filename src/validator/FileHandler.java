package validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
            List<String> contents = Files.readAllLines(Paths.get(directory, filename));
            return contents;
        } catch (IOException e) {
            return null;
        }
    }

//  ===================  4. Create a method to write (append) new contents to a file. ==================================
// This method could have an optional parameter to choose between appending the contents of the file or not.

    public boolean writeToFile(List contents) {

        try {
            Files.write(Paths.get(directory, filename), contents /*StandardOpenOption.APPEND*/);
        } catch(IOException e) {
            return false;
        }
        return true;
    }
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
