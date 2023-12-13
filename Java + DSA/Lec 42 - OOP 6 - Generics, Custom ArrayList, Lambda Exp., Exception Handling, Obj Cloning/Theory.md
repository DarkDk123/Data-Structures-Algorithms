### **Now that we know OOP Core Concepts, let's create Our Custom ArrayList:**

## Custom ArrayList : 
Custom ArrayList replicating the functionality of built-in ArrayList Type. By Implementing various methods and techniques.

The List we created in "CustomListExample.java" file, it's not worth it.

Cause it can work only with "int" data types<br>
Even if we adapt it to multiple data types, we we'll have to change almost 90% of our code!!

This problem will be solved using Generics.


## Generics :


Generics allow you to abstract over types.

In java, Generics provide a way to create classes, interfaces & methods with place-holders for data types.<br>
The main purpose of this is to enable you to write code that can work with different type of data while maintaining type safety.

When using generics in Java, you can use any valid identifier as a placeholder for the generic type, and it's common to see single uppercase letters like T, K, V, E, or any other meaningful identifier that follows Java's naming conventions.

Docs [1](https://docs.oracle.com/javase/tutorial/extra/generics/intro.html), [2](https://docs.oracle.com/javase/tutorial/java/generics/types.html).

[Restrictions](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjsx-m80YmDAxW6fGwGHfAYAzMQFnoECA4QAQ&url=https%3A%2F%2Fdocs.oracle.com%2Fjavase%2Ftutorial%2Fjava%2Fgenerics%2Frestrictions.html&usg=AOvVaw3L3i-PE7RnXld1CIQlfI2I&opi=89978449) Over Generic Usage!

Example code of Generics are [here](./CustomGenList.java).

## Wildcards in Generics :

It's a way to give more flexibility while programming.

It is used where a type parameter is given like `List<Type>`

It allows more flexible type parameter than a specific class or interface.<br>It is useful when we want to operate on different types without committing to a specific type. 

It is denoted using **"?"**.

There are three **types** of Wildcards :

1. Unbounded wildcard. `List<?> myList;`
2. Upper bounded wildcard. `List<? extends Number> numberList;`
3. Lower bounded wildcard. `List<? super Integer> integerList;`

These are described more in the example file : [WildCards.java](./WildCards.java).

Read more [here](https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html).