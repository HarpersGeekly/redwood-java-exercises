package arraysAndCollections;

import validator.Validator;

/**
 * Created by RyanHarper on 9/26/17.
 */
//===========================================    Server Name Generator  ================================================
public class ServerNameGenerator {
//        Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.

    private static String[] adjectives = {"Short", "Tall", "Old", "Young", "Important", "Fast", "Slow", "Big", "Dumb", "Wise"};

    private static String[] nouns = {"Bus", "Airplane", "Train", "Tree", "Animal", "Person", "London", "Lightning", "Apple", "Banana"};

//        Create a method that will return a random element from an array of strings.

    private static String generateRandomName() {
        int rnd1 = (int) (Math.random() * adjectives.length);
        int rnd2 = (int) (Math.random() * nouns.length);
        return adjectives[rnd1] + "-" + nouns[rnd2];
    }

    // or...
    private static String randomNames(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }

//        Add a main method, and inside of your main method select a random noun and adjective and hyphenate
//        the combination and display the generated name to the user.

    public static void main(String[] args) {

        Validator validator = new Validator();

        System.out.println("Here is your random server name:");

        do {
            System.out.println(generateRandomName());
            System.out.println(randomNames(adjectives) + "-" + randomNames(nouns));
        } while(validator.yesNo("Keep Generating? Y/N"));
        System.out.println("goodbye.");
    }
}

