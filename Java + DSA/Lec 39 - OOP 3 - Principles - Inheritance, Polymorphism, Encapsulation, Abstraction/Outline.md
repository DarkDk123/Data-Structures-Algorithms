### We'll learn about the 4 core principles of Object Oriented Programming.

1. Inheritance
2. Polymorphism
3. Encapsulation
4. Abstraction
___

## 1. **Inheritance :**
Inheritance is acquiring properties & behaviours of existing classes by inheriting them in child classes.

* In Java, "extend" keyword is used for inheritance.
* We can't inherit private properties and methods.
* "super" keyword is used for calling the constructor of Parent class.
* "super" refers to Exactly above "parent" class.


Also `Parent obj = new Child();`, is correct but `Child obj = new Parent(obj);` isn't correct. 

The Operations allowed here is defined by the ref. type only.

1. `In Parent obj = new Child()`, it's valid because of polymorphism and 
   the "is-a" relationship. A Child object "is-a" Parent, so it can be assigned to a Parent reference.

2. `In Child obj = new Parent(obj)`, it's incorrect because a Parent 
   object may not have all the attributes or behaviors expected by the Child class. The assignment violates the "is-a" relationship, and the compiler will raise an error.

3. To address this, you can use casting like `Child obj = (Child) new 
   Parent()`, if you are sure the object is indeed an instance of the Child class. However, this may lead to runtime errors if the object is not of the correct type.

### **1.1 Types of Inheritance :** 
   **A. Single Inheritance :**  A Child Class inheriting a Parent Class.

   **B. Multi-level Inheritance :** A child class inherits from another class, and that parent class, in turn, inherits from another class. It creates a chain of inheritance where each class is a child of the previous one in a hierarchical structure.

   **C. Multiple Inheritance :** When a child class inherits more than 1 parent classes. Not directly supported in java. (Will be covered in Interfaces).

   **D. Tree/Hierarchical Inheritance :** Multiple child classes inherits single parent class, hence forming a tree like structure.

   **E. Hybrid Inheritance :**  Combination of all above 4 Inheritances, not supported in java directly.

## **2. Polymorphism :**

Polymorphism means ***multiple ways of representing the same thing.***
When a object, method, property etc. with same name behaves differently, it is called **Polymorphism**.
 
Polymorphism is like having one name but many behaviors. In programming, it means using the same name (like a method or property) in different ways. For example, a method named "draw" can be used to draw various shapes, each with its unique behavior.

### **Examples :**
There are many examples of polymorphism already explained i.e. in ***Inheritance.java***, the **Human** constructor behaves differently based on given parameters.

### Types of Polymorphism : 

1. **Compile time / Static Polymorphism :** Polymorphism is when same object shows multiple behaviors. When the "behavior" to be shown is decided on compile time of the program, is called **Compile Time** Polymorphism.

   When Compiler decides what behavior to show when polymorphism occurs, it is called **Compile Time** Polymorphism.

   **For Example :** Method overloading, constructor overloading etc.

2. **Runtime/Dynamic Polymorphism :** When the behaviour of an object is decided on runtime, it is called **Runtime/Dynamic Polymorphism**.

   When we don't know which behaviour to invoke at the compile time, it is decided on the runtime of the program. Hence, it's called **Runtime/Dynamic Polymorphism**.

   **For example :** Method Overriding. | Shown in "RuntimePoly.java" file.

   1. `"final" keyword before a method restricts it to be overridden.`
   2. `"final" keyword before a class restricts it to be inherited, also makes it's contents as final.`

   3. `static attributes & methods are class specific, hence cannot be overriden.`
