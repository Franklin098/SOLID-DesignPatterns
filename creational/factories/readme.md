# Factories

Factory Method and Abstract Factory

Factory pattern helps to create loosely coupled OOP design.

**We should favor abstractions (superTypes) instead of concrete implementations**.

Whenever we use the 'new' keyword we violate this principle.

```
Animal dog = new Dog() // we are using a concrete implementation with the new

// with factory we can instantiate the classes in a separate class
Animal dog = AnimalFactory.getDog(); 
```

## Motivation

Constructors are not descriptive. The name of the constructor is the same as the name of the containing type, so we have no flexibility to give another name for different constructions.

    * We cannot overload with same sets of arguments with different names.
    * Can turn into 'overloading hell' a lot of constructors calling other constructors

## Use Cases of Factories

* Factories help with Wholesale object creation (not piecewise like builder)

* We create a separate function with the name we want (Factory Method) , this may exist in a separate class (Factory Class)

* Can create hierarchy of factories with **Abstract Factory**

## What is a Factory ?

A component responsible for the wholesale (not piecewise) creation of objects.

> Go to /simplefactory to see the demo !