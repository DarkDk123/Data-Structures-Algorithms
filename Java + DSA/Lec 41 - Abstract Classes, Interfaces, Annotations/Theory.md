## **Abstract Classes :**

An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. It serves as a blueprint for other classes and allows you to define abstract methods that must be implemented by any concrete (non-abstract) subclasses.


* They are used as **Blueprint classes** for other concrete classes.

* We can't create an Object from an abstract class. Abstract classes can't be instantiated on its own.

* **Abstract classes** may contain abstract methods, but they are not required to do so. They can also include concrete methods with implementations.

* They can have a **constructor**, but can be used only in child class's constructor.

* We can't create **Abstract Constructors** and **Abstract static methods**.

**Abstract Methods** are methods that are declared without any body and must be declared in an abstract class. This methods meant to be implemented by **concrete sub-classes** (non-abstract). 