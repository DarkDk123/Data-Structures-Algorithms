import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        
        // Varargs are variable number of arguments to a function/method

        printhis(1,2,3,4);
    }

//  Function that takes variable number of int arguments.

    static void printhis(int ...varargs){
        // varargs stored as Array
        // Gettings str repr of Array
        System.out.println(Arrays.toString(varargs));
    }
}
