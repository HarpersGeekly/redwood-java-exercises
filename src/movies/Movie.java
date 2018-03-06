package movies;
/**
 * Created by RyanHarper on 9/26/17.
 */
//        We are going to build an application that keeps track of movies and displays them by category. Create a class named Movie.
//        It should have private fields for name and category, and a constructor that sets both of these.

public class Movie {

    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "TITLE: '" + title + '\'' +
                ", GENRE: '" + genre + '\'' +
                ", RATING: " + rating +
                '}';
    }


}
//        Download the MoviesArray class. This class has a static method named findAll that will return an array of Movie objects.
