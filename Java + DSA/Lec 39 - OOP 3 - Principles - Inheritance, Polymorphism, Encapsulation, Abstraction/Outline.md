### We'll learn about the 4 core principles of Object Oriented Programming.

1. Inheritance
2. Polymorphism
3. Encapsulation
4. Abstraction
___

1. **Inheritance :** Inheritance is acquiring properties & behaviours of existing classes by inheriting them in child classes.

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