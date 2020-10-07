//We are going to build a server name generator. Create a class inside of src named ServerNameGenerator,
// and follow the specs below.
//
//        Create two arrays whose elements are strings: one with at least 10 adjectives,
//        another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select a random noun and
//        adjective and hyphenate the combination and display the generated name to the user.

//        Example Output
//        Here is your server name:
//        dedicated-photon

import java.util.Random;

public class ServerNameGenerator {

    private static final String[] nouns = {"aeroplane", "bear", "crate", "duck", "egg",
        "fowl", "ghost", "hinge", "jackhammer"};
    private static final String[] adjectives = {"large", "distant", "glorious", "faithful", "undeserving",
        "hollow", "radical", "uptight", "groovy", "altruistic"};


    public static void main(String[] args) {
        System.out.println(generateServerName());
    }

    public static String generateServerName() {
        int randomNounIndex = new Random().nextInt(10);
        int randomAdjectiveIndex = new Random().nextInt(10);

        return adjectives[randomAdjectiveIndex] + "-" + nouns[randomNounIndex];
    }
}
