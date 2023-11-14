public class StaticBlock {
    
    public static void main(String[] args) {
        // Just print 'a' it's assigned 10 at first, and just the static block is executed.
        System.out.println(StaticClass.a);
    }
}

class StaticClass {
    static int a = 10;

    // This block automatically get's executed when class is defined!
    // Doesn't need any object instantiation.
    static{
        a *= 70;
    }
}
