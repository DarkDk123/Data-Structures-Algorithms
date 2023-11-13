/**
 * I have made it pretty meshed up!! So, sorry for that.
 */

import java.util.Arrays;

public class CreateClass {
    public static void main(String[] args) {
        // let's create a Class 
        // Created below this main class

        // Now, let's create a reference variable to the class's obj. (not creating obj)

        // Just declaring
        Student dipesh;


        // Printing it leads to null | not initialized in heap memory
        // Can't print cause not initialized !

        // Array to store data of 5 students | 5 student objects.
        Student[] Students = new Student[5];

        // We can print it.
        System.out.println(Arrays.toString(Students));


        // creating actual objects using "new" keyword.
        // And initialized variable dipesh
        // "new" keyword allocates memory at runtime (dynamic memory allocation).
        dipesh = new Student();

        // Assigning values to it's attributes (variables).

        dipesh.name = "Dipesh";
        dipesh.roll = 25;

        System.out.println(dipesh.name); // accessing & printing attributes.     

        // We can't always assign values to attributes this way (when there are more attributes)
        // This way Constructor comes in way.

        
        // New class "Building" with Constructor

        Building build1 = new Building("Elon Musk");

        // Getting owner of build1
        System.out.println(build1.owner);

        // Functions inside class.
        build1.getOwnerWithCrush();


        // Multiple Constructors.
        Building home = new Building("Virat", "Anushka");

        home.getOwnerWithCrush();

        // Multiple reference variables.
        Building StolenHome = home;

        StolenHome.owner = "Chacha Vidhayak hai apne!"; // Changed owner via one reference variable

        // Changed object state (know from 2nd ref. variable)
        home.getOwnerWithCrush();
    }
}

// our class 

class Student{
    String name;
    int roll;
    int marks;
}



// Class with constructor.
class Building {
    // Declare attributes (this are actually instance variables)
    String owner;
    String crush = "Imaginary";
    // Constructor (same name as class)
    Building(String o){
        this.owner = o; // Instance variable using "this" keyword | also can use 'owner' directly | "this" is just used to avoid name conflicts.
    }
    
    // Adding Function to the Class
    void getOwnerWithCrush(){
        System.out.println("Owner is " + this.owner + " with crush " + this.crush);
    }

    // Multiple constructors | Method Overloading.
    Building(String o, String c){
        this.owner = o;
        this.crush = c;
    }
}