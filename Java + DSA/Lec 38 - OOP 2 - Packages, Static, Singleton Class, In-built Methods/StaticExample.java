/**
 * Example of 'static' keyword.
 */

public class StaticExample {
    public static void main(String[] args) {
        Human Dipesh = new Human(19, 0, "Dipesh", -1, false);
        Human Unknown = new Human(22, 143, "Unknown", 7, true);

        System.out.println("Total Population : " + Human.population);
        Dipesh.aadhar();
        Unknown.aadhar();

        Human.population = 500; // We can modify it through class.
        System.out.println("\n\nNew Population " + Human.population);

        // We can define attributes, method as static.
        // can't use non-static things in any static method.
    }
}

/**
 * Human
 */
class Human{
    // instance variable
    int age;
    int bankBalance;
    String name;
    int salary;
    boolean married;

    // Static variables | class variables - do not depend on instances.
    static long population;

    Human(int age, int bb, String name, int salary, boolean married){
        this.age = age;
        this.bankBalance = bb;
        this.name = name;
        this.salary = salary;
        this.married = married;

        // Static variables (common for all instances) can be used by 3 types.

        // this.population += 1; | Avoid using "this" for a variable that isn't related to instance itself is unconventional!
        // We shouldn't use it using 'this' keyword cause 'this' refers to instance itself.

        // population += 1; // This is fine. but can be confusing.
        // static variables are related to classes, and should be used with Class name only.

        Human.population += 1; // Static variable common to all instances.
    }

    // method to print details of the Human.
    void aadhar(){
        System.out.printf(
            "\nHello! i'm %s, %d years old and having %d in bank.\nMy salary is %dk And married? %b\n",
            this.name, this.age, this.bankBalance, this.salary, this.married);
    }   
}
