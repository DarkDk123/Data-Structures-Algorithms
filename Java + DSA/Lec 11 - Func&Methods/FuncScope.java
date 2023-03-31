public class FuncScope{
    public static void main(String[] args) {
        // About some about Scopes of variables, functions etc.
        int x = 10;
        System.out.println("X at main function scope: " + x);
        if (x==10){
            int y = 1; // This 'y' is in local scope.
            System.out.println("y in local scope: " + y);
        }

         //Can't Use 'y' here since it's in the if block's local scope.

        // System.out.println(y);

        // Calling a method.
        locmethod();

    }

//  This Method Can't be accessed directly outside this Class
//  But can referenced Anywhere in this class. 

    static void locmethod(){
        System.out.println("I am a Method of this BasicFunc Class only.");
    }
}