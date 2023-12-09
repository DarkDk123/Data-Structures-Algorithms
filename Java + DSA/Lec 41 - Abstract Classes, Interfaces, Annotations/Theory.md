## **Abstract Classes :**

An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. It serves as a blueprint for other classes and allows you to define abstract methods that must be implemented by any concrete (non-abstract) subclasses.


* They are used as **Blueprint classes** for other concrete classes.

* We can't create an Object from an abstract class. Abstract classes can't be instantiated on its own.

* **Abstract classes** may contain abstract methods, but they are not required to do so. They can also include concrete methods with implementations.

* They can have a **constructor**, but can be used only in child class's constructor.

* We can't create **Abstract Constructors** and **Abstract static methods**.

**Abstract Methods** are methods that are declared without any body and must be declared in an abstract class. This methods meant to be implemented by **concrete sub-classes** (non-abstract). 

## **Interfaces :**

Java Interfaces are somewhat similar to Abstract Classes.

They provide a way to achieve abstraction and **support multiple inheritance** by allowing classes to implement multiple interfaces.

A class uses **"implements"** keyword to implement an interface.

**It helps better encapsulation and flexibility.**

They provide additional things : 

  * **Methods are Abstract :** In an interface, all methods are implicitly abstract.
  
  * **Multiple Inheritance:** Java allows a class to implement multiple interfaces. This facilitates multiple inheritance of types.
  
  * **Fields are Implicitly Public, Static, and Final:** Fields in interfaces are implicitly public, static, and final. They must be constants and cannot have instance-specific values. 
  
  * **No Constructor:** Interfaces cannot have constructors because they cannot be instantiated directly. 

  * **No Method Body:** Prior to Java 8, interfaces did not allow method bodies. However, Java 8 introduced default (normal) and static methods in interfaces, providing a way to include method implementations.


## **Annotations :**

Annotations in Java provide a way to add metadata to code. They offer additional information about the code to tools, frameworks, or runtime environments. Annotations start with the '@' symbol and can be applied to classes, methods, fields, parameters, and other program elements.

**Examples of Built-in annotations :** @Deprecated, @override, @SuppressWarnings etc.
