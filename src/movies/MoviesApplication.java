package movies;
import validator.Validator;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by RyanHarper on 9/26/17.
 */
public class MoviesApplication {

        public static Validator validator = new Validator();
        public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        do {
            System.out.println("===========================");
            System.out.println("What would you like to do? ");
            System.out.println("===========================");
            System.out.println("[1] View All movies");
            System.out.println("[2] View Animated movies");
            System.out.println("[3] View Musical movies");
            System.out.println("[4] View Comedy movies");
            System.out.println("[5] View Drama movies");
            System.out.println("[6] View Horror movies");
            System.out.println("[7] View Sci-Fi movies");
            System.out.println("[8] Add a movie"); // will only exist in memory (for now...) [see: file handling]

            int userChoice = validator.getIntWithinRange("Enter your choice: ", 1, 8);
            getGenreFromUser(userChoice);

        } while (validator.yesNo("Would you like to see a new list? Yes/No"));
        System.out.println("Goodbye.");
    }
    // =================================================================================================================
    // =================================================================================================================

    public static void getGenreFromUser(int userChoice) {

        switch (userChoice) {
            case (1):
                showMovies("all");
                break;
            case (2):
                showMovies("Animated");
                break;
            case (3):
                showMovies("Musical");
                break;
            case (4):
                showMovies("Comedy");
                break;
            case (5):
                showMovies("Drama");
                break;
            case (6):
                showMovies("Horror");
                break;
            case (7):
                showMovies("Scifi");
                break;
            case (8):
                addMovie();
                break;
            default:
                System.out.println("ERROR -- we should never get here");
                break;
        }
    }

        // Now that we have the users genre, int userChoice, we now sort through all the movies in moviesArray
        // and find each movie that has the genre the user chose...
        // remember: static methods are able to be used in the main method.

    public static void showMovies(String genre) {

        // Movie[] movies = MoviesArray.findAll(); //moved to Class level.
        // the method findAll() in MoviesArray is "static" so now we have access to it here!
        // If not, I'd have to make "MovieArray mv = newMoviesArray()" above with an instance to call on.

        System.out.println("The following is a list of " + genre + " movies:");
        System.out.println("==========================================");

        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(genre) || genre.equalsIgnoreCase("all")) {
                System.out.println(movie.getTitle() + " -- " + movie.getGenre() + "--" + movie.getRating());
                //you can refactor this with toString()...
//                System.out.println(movie.toString());
            }
        }

        System.out.println("==========================================" + "\n");
    }

    private static void addMovie() {
        //get input from the user title and genre
        String title = validator.getString("Enter a title:");
        System.out.println("Animated");
        System.out.println("Musical");
        System.out.println("Comedy");
        System.out.println("Drama");
        System.out.println("Horror");
        System.out.println("Scifi");
        String genre = validator.getString("Enter a genre:");
        int rating = validator.getIntWithinRange("Enter a rating between 1 and 5:",1, 5);

        // Create a movie object based on user input
        Movie newMovie = new Movie(title, genre, rating);
        System.out.println("You added: " + title + ". Genre: " + genre + ". Rating: " + rating);

        // "Add" that movie to the movie array...
        //create a copy of the array with a larger length:
        Movie[] moviesPlus = Arrays.copyOf(movies, movies.length + 1);

        // Add new movie to the copy. set the item at the last index to our new array
        int lastIndex = moviesPlus.length - 1;
        moviesPlus[lastIndex] = newMovie;

        // Reassign the movies property to our new array
        movies = moviesPlus; // forget the old movies array. We will now refer to this new copy that is longer that we created
        // Java garbage dump takes care of memory issue.
    }

//        Bonus:
//        - When a new movie is added, make sure the category the user enters is one of the existing categories
//        - Allow the user to search for a movie by title
//        - Give the user the ability to modify an existing movie (either change the title or genre)
//        - Give each movie a rating (an integer between 1 and 5) property. Can you think of a way to add a
//              rating to all the movies without hardcoding them into the `MoviesArray` class? How many changes will you
//              need to make to your existing code to make this change happen? How could you minimize the number of changes needed?
//        - Research the `.toString` method to give your `Movie` objects a nice string representation (edited)

    // ========================================================================================================
    // ========================================================================================================

//    public static ArrayList<Movie> convertArrayToList(Movie[] movies){
//        ArrayList<Movie> newMovieArrayList = new ArrayList<Movie>(Arrays.asList(movies));
//        return newMovieArrayList;
//    }
//
//    public static ArrayList<Movie> addToArrayList(Movie movie, ArrayList<Movie> newMovieList){
//        newMovieList.add(movie);
//        return newMovieList;
//    }
//
//    public static String[] convertListToArray(ArrayList<Movie> newMovieList){
//        String[] ins = (String[])newMovieList.toArray(new String[newMovieList.size()]);
//        return ins;
//    }
//
//    public String[] addNewItemToArray(Movie movie, ArrayList<Movie> newMovieList){
//         convertedList = convertArrayToList(movies);
//        ArrayList<Movie> convertedList = addToArrayList(movie, newMovieList);
//        return  convertListToArray(convertedList);
//    }

}

// Fer's way...
//        for(Movie movie: movies) {
//            if (genre.equalsIgnoreCase(movie.getGenre())) {
//                System.out.println(movie.getTitle() + "-" + movie.getGenre());
//            } else if (genre.isEmpty()) /* replace "all" with "" */ {
//                System.out.println(movie.getTitle() + "-" + movie.getGenre());
//            }
//        }
