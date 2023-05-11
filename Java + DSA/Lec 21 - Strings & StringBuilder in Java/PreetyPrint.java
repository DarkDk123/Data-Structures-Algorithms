import java.util.ArrayList;
public class PreetyPrint {
   public static void main(String[] args) {
      // String Formatting in Java
      // Format Specifiers

      float a = 12.214f;
      System.out.printf("This is Formatting String with placeholder float: %.2f", a);
      System.out.printf("\nValue of Pie rounded: %.3f\n", Math.PI);
      // There is "StringFormatPlaceholder.txt" which denotes all the PlaceHolders for
      // Formatting Strings.
      System.out.printf("Hey It's me, %s", "dipesh\n");

      // Operators for Strings & Chars.

      // Adding two characters gives it's ASCII Sum.
      System.out.println('a' + 'b');
      System.out.println("a" + "b"); // Adding Strings will concatenate it.

      // Anything added to a string with '+' operator, Converts that into a String &
      // Concatenates it.
      // Here int converted to Integer obj and 'toString' Method is called.
      System.out.println("Adding Anything to a String like: " + 27);

      // On concatenation with a String, every obj's 'toString' method is called to
      // get it as a String.
      System.out.println("String + ArrayList obj: " + new ArrayList<>());

      // We can use '+' operator only with Primitives or objects (if any of them is a
      // String) or Objects of Same Type (only if allowed)
      System.out.println(new Float(12) + new Integer(15)); // Deprecated, still just to show it.
      System.out.println("String + Int: " + 45);
   }
   // Note: * Operator Overloading isn't supoorted in java. * 

}
