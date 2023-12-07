/**
 * Examples of Access Modifiers | Just a little.
 */

// Public class must be in it's own named file.
public class AccessModify {
    public static void main(String[] args) {
        System.out.println("Explained Access Modifiers !!");
    }
}

class Access_Modifiers{
    // default - avialable everywhere in package.
    String defaultMsg = "I'm default (package-private), used everywhere in the package only.";
    
    // private - only this class can access it directly.
    private String privateMsg = "I'm private, only this class can access me directly.";

    // public - available everywhere.
    public String publicMsg = "I'm public, I'm available to everyone in the world.";

    // Protected - available in all of it's derived classes.
    protected String protectedMsg = "I'm protected, must inherit this class to use me anywhere";


    // getter for "privateMsg".
    public String getPrivateString(){
        // Apply some checks here.

        // Only return if conditions are met.
        return privateMsg;
    }

}