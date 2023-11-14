/*
 * Singleton class, allows only single object to be created,
 * may return the existing object if new object is requested.
 */
public class SingletonClass {
    boolean AreYouOk;
    private static SingletonClass object;

    // Make private constructor.
    private SingletonClass(boolean AreYouOk){
        this.AreYouOk = AreYouOk;
    }

    // public method to create object.
    // Must be static to allow calling before the object is created.
    public static SingletonClass getInstance(boolean AreYouOk){
        if (object==null){
            return new SingletonClass(AreYouOk); // Create first object.
        }

        return object; // Return existing object!!
    }
}
