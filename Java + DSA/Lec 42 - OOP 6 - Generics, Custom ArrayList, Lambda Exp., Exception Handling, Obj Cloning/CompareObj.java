import java.util.Arrays;
import java.util.Comparator;

/**
 * We can compare two Objects of same type by Overriding "compareTo" method.
 * By Implementing "Comparable" Interface, we can get "comparing" functionality of classes.
 * This method is used to sort collections of this Objects.
 * 
 * This "compareTo" method is used to compare it with other object of same type.
 */

public class CompareObj {
    public static void main(String[] args) {
        
        Student topper = new Student("Topper", 97.6f);
        Student loser = new Student("Loser", 17);
        Student average = new Student("Average", 77);

        Student[] StudentsClass = {topper, loser, average};

        // We Can compare two objects.
        if (topper.compareTo(loser) > 0) System.out.println("Topper is great!");

        // Can use Sort method on these objects.
        System.out.println("Array Before Sort : " + Arrays.toString(StudentsClass));
        Arrays.sort(StudentsClass);
        System.out.println("Array Before Sort : " + Arrays.toString(StudentsClass));

        // We Can give "Comparator obj" to "Sort" method directly.
        Arrays.sort(StudentsClass, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // Compare objects
                return (o1.name.compareTo(o2.name));
            }
        } );

        // Average Student is great !!😅
        System.out.println("\n\nAfter Sorting names :" + Arrays.toString(StudentsClass));

    }
    
}

// A class will be comparable if implements "Comparable" Interface.
class Student implements Comparable<Student>{ // Implementing Comparable interface. | Interface with generic types.
    String name;
    float marks;

    Student(String name, float marks){
        System.out.println("Student %s Created !".formatted(name));
        this.name = name;
        this.marks = marks;
    }
    
    // Must override "compareTo" method.
    @Override
    public int compareTo(Student o) {
        // Returns difference of current and given Students.
        return(int)(this.marks - o.marks);
    }

    // Overriding toString method.
    @Override
    public String toString() {
        return this.name +  "|" + this.marks;
    }
}
