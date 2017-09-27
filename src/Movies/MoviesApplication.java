package Movies;
import Validator.Validator;
/**
 * Created by RyanHarper on 9/26/17.
 */
public class MoviesApplication {
    public static void main(String[] args) {

        Validator validator = new Validator();

        do {
            System.out.println("===========================");
            System.out.println("What would you like to do? ");
            System.out.println("===========================");
            System.out.println("[1] View All Movies");
            System.out.println("[2] View Animated movies");
            System.out.println("[3] View Musical movies");
            System.out.println("[4] View Comedy movies");
            System.out.println("[5] View Drama movies");
            System.out.println("[6] View Horror movies");
            System.out.println("[7] View Sci-Fi movies");
//            System.out.println("[8] Add a movie");

            int userChoice = validator.getIntWithinRange("Enter your choice: ", 1, 7);
            getGenreFromUser(userChoice);

        } while (validator.yesNo());
        System.out.println("Goodbye.");
    }

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
//            case (8):
//                addMovie(String title, String genre);
            default:
                break;
        }
    }

    //Now that we have the users genre, int userChoice, we now sort through all the movies in moviesArray
    // and find each movie that has the genre the user chose...

// remember: static methods are able to be used in the main method.

    public static void showMovies(String genre) {


        Movie[] movies = MoviesArray.findAll(); // the method findAll() in MoviesArray is "static" so now we have access to it here!
        // If not, I'd have to make "MovieArray mv = newMoviesArray()" above with an instance to call on.

        System.out.println("The following is a list of " + genre + " movies:");
        System.out.println("==========================================");

        for (Movie movie : movies){
            if(movie.getGenre().equalsIgnoreCase(genre) || genre.equalsIgnoreCase("all")){
                System.out.println(movie.getTitle() + " -- " + movie.getGenre());
            }
        }

        // Fer's way...
//        for(Movie movie: movies) {
//            if (genre.equalsIgnoreCase(movie.getGenre())) {
//                System.out.println(movie.getTitle() + "-" + movie.getGenre());
//            } else if (genre.isEmpty()) /* replace "all" with "" */ {
//                System.out.println(movie.getTitle() + "-" + movie.getGenre());
//            }
//        }

        System.out.println("==========================================" + "\n");
        System.out.println("Would you like to see a new list? Yes/No");
    }
}

//        Bonus
//        Add functionality to allow a user to add a new movie to the list.

