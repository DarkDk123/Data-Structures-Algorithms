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

        Building build1 = new Building("Elon Must");

        // Getting owner of build1
        System.out.println(build1.owner);
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

    // Constructor (same name as class)
    Building(String o){
        this.owner = o; // Instance variable using "this" keyword | also can use 'owner' directly | "this" is just used to avoid name conflicts.
    }
    
}