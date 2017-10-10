import validator.FileHandler;
import validator.Validator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Created by RyanHarper on 10/6/17.
 */
public abstract class PlaylistApp implements Comparator<String> {

    public static void main(String[] args) {
        Validator validator = new Validator();
        FileHandler fh = new FileHandler("music", "playlist.txt");
        List<String> playList = fh.retrieveFileContents();

        do {
            showMainMenu();
            int userInput = validator.getIntWithinRange("Enter an option (1, 2, 3, 4 or 5):", 1, 7);

            switch (userInput) {
                case (1):
                    viewPlayList(playList);
                    break;
                case (2):
                    addSong(playList, validator, fh);
                    break;
                case (3):
                    removeSong(playList, validator, fh);
                    break;
                case (4):
                    shufflePlaylist(playList, validator);
                    break;
                case (5):
                    sortByDuration(playList);
                    break;
                case (6):
                    filterByArtist(playList, validator);
                    break;
                case (7):
                    System.exit(0);
                default:
                    break;
            }
        } while (validator.yesNo("Main Menu? Y/N"));

        fh.writeToFile(playList);

    }

    private static void showMainMenu() {

        System.out.println("[1] View playlist");
        System.out.println("[2] Add a song");
        System.out.println("[3] Delete a song");
        System.out.println("[4] Shuffle playlist");
        System.out.println("[5] Sort by duration");
        System.out.println("[6] Filter by Artist");
        System.out.println("[7] Exit");
    }

    private static void viewPlayList(List<String> playList) {
        System.out.println("Music PlayList");
        System.out.println("Title | Artist | Duration");
        System.out.println("-----------------------");

        for(String song : playList) {
            System.out.println(song);
        }
    }

    private static void addSong(List<String> playList, Validator validator, FileHandler fh) {

        do {
            String title = validator.getString("Enter a song title to add:");
            String artist = validator.getString("Who is the artist?");
            String duration = validator.getSongLength("Length of song:");
            playList.add(title + " | " + artist + " | " + duration);

        } while (validator.yesNo("Add another song? Y/N"));
        fh.writeToFile(playList);
    }


    private static void removeSong(List<String> playList, Validator validator, FileHandler fh) {

        do {
            String toDelete = validator.getString("Enter an artist or song to delete");

            playList.removeIf(song -> {
                if (song.contains(toDelete) && validator.yesNo("Are you sure you want to delete " + song + "? Y/N")) {
                    System.out.println(song + " has been removed");
                    return true;
                } else {
                    return false;
                }
            });

        } while (validator.yesNo("Delete another? Y/N."));
        fh.writeToFile(playList);
    }

    private static void shufflePlaylist(List<String> playList, Validator validator) {
        do {
            Collections.shuffle(playList);
            viewPlayList(playList);
        } while (validator.yesNo("Shuffle again? Y/N"));
    }

    private static void sortByDuration(List<String> playList) {

            Collections.sort(playList, new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return extractInt(o1) - extractInt(o2);
                }

                int extractInt(String s) {
                    String num = s.replaceAll("\\D", "");
                    // return 0 if no digits found
                    return num.isEmpty() ? 0 : Integer.parseInt(num);
                }
            });
            viewPlayList(playList);
    }

    private static void filterByArtist(List<String> playList, Validator validator) {

        do {
            String contactName = validator.getString("Enter artist to filter:");

            for (String artist : playList) {
                if (artist.contains(contactName)) {
                    System.out.println(artist);
                }
            }
        } while (validator.yesNo("Filter another artist? Y/N"));
    }
}
