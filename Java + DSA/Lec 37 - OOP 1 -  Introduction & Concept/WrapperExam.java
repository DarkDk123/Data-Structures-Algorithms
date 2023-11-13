public class WrapperExam {
    public static void main(String[] args) {
        int a = 10;
        
        // Primitives are just simple values.
        // They don't have any method or attributes as objects.
        System.out.println("Primitive a : " + a);


        // Wrapper class | to make primitives an object
        Integer b = 10;
        System.out.println("Wrapper 'b' Class : " + b.getClass());

        // Final keyword
        final int myPhone = 1198988674; // Can't change
        System.out.println(myPhone);

        
    }
}
