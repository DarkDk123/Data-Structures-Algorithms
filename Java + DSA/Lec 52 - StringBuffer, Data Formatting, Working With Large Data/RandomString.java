import java.util.Random;

/**
 * RandomString
 * 
 * Generating random strings!
 */
public class RandomString {
    public static void main(String[] args) {
        String randomString = RandomStringGenerator.generate(20);
        System.out.println("Generated Random String is \"%s\"".formatted(randomString));
    }
}

/**
 * RandomStringGenerator
 * 
 * Generates String with random upper & small case characters!
 */
class RandomStringGenerator {
    public static String generate(int length) {

        // We creates a Random Object here!
        // which serves us services as methods!
        Random random = new Random();

        int[] ascii = new int[]{ 65, 97}; // Ascii for char "A" or "a"!

        // Generate a String of Random characters of given length!
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            char ch = (char) (ascii[random.nextInt(2)] + (26 * random.nextFloat())); // Random char within 26 chars range!
            sb.append(ch);
        }

        return sb.toString();
    }

}