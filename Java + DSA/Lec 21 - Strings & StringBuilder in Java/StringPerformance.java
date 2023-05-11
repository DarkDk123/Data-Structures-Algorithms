import java.util.Arrays;

public class StringPerformance {
    public static void main(String[] args) {
        // Performance factor of Strings.
        // Getting a-z as a String. // This Code has Much Memory Wastage.
        String alpha = "";
        for (int i = 0; i < 26; i++) { // Much Memory Waste
            alpha += (char) ('a' + i); // Creating New String Obj everytime & appending it with next char.
        }
        System.out.println(alpha);


        // To Optimize above code. There is a class 'StringBuilder' just like String,
        // which allows to modify it's object unlike Strings.
        StringBuilder sBuilder = new StringBuilder();
        // Memory Efficient
        for (int i = 0; i < 26; i++) sBuilder.append((char)('a' + i)); // Appending to StringBuilder (Not Creating New Obj)
        System.out.println(sBuilder);
        // String Builder obj has many Methods, try to Explore them.
        System.out.println(sBuilder.substring(3, 10));
        System.out.println(sBuilder.reverse());
        
        // Also Explore String Obj Methods.
        System.out.println("String.toCharArray(): " + Arrays.toString(alpha.toCharArray()));
        System.out.println("String.toUpperCase(): " + alpha.toUpperCase());
    }
}
