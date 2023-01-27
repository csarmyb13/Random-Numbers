import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a new instance of the Random class
        Random rand = new Random();

        // Generate a random number between 0 and 9
        int randomNum = rand.nextInt(10);
        System.out.println("Random number: " + randomNum);
    }
}