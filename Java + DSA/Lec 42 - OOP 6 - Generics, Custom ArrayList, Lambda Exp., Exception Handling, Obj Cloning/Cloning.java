public class Cloning{
    public static void main(String[] args) throws Exception{
        Human rahul = new Human("rahul");

        // We can handle Exception, or specify that this type can throw an Exception | after the name of the Class.
        Human rahulBhai = (Human) rahul.clone();

        System.out.println(rahul.name + " is same as " + rahulBhai.name);
    }
}

// We must implement Cloneable to allow it to clone using "clone" method.
class Human implements Cloneable{
    String name;
    
    Human(String name){
        this.name = name;
    }

    // This method may throw an Exception.
    // we have to handle it somewhere.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // It's doing Shallow Copy.
        return super.clone();

        // Also, We can implement Logic for Deep Copy here.
    }
}
