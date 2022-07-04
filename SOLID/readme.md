# SOLID Design Principles

A set of software design principles intrudeced by Robert C. Martin.

These principes help to create clean and reusable code.

# Single Responsability Principle

**Every class or method should have a single primary responsability, a single reason to change.**

If a class has a lot of responsabilities, then it becomes a God Class, which is an anti-pattern.

* Separation of concerns.
* Always take a look wich is the esencial responsability (methods, behaviors) that a class should have.
* Separate in multiple classes if necessary, each of them with a clear single responsability.

God classes are difficult to refactor, to test and read.

> See singleresponsability package for a demo.

# Open-Closed Principle

**Classes, modules should be open for extension (inheritance), but closed for modification (changes in the existing code, like adding more methods or modifying existing code).**

* The OCP states that the design and writting of the code should be done in a way that new functionality should be added with minimum changes in the existing code.

* We should keep as much existing code unchanged as possible.

An application should take care of the frequent changes that are done during the development and the maintenance phases For example adding or removing features. Software development is an iterating and dynamic process.

* Changes in the existing code should be minimized.
* It's assumed that the existing code is already unit tested.
* Changes in already written code might affect the existing functionality in an unwanted manner.

OCP relies on -Abstractions-

A class should not extend an othe class explicitly - we should define a common interface instead.

We can change the classes at runtime due the common interface.

Strategy Pattern and Template Pattern can help to guarantee that open-closed is not violated.

> See openclosed package for a demo.

# Liskov Substitution Principle

**Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application**

We usually create class hierarchies during the application development, we extend some classes and creating some derived classes. 

* Child classes should dever break the parent class type definition.
* Subtypes must be substitutable for their base types.

We should not break funcitonality in child classes.

SOLID principle are not independent of each other, if we valioate one principle probably we are violating other principle.

The violation of Liskov principle is a latent violation of Open-Closed principle.

# Iterface Segregation Principle

**Software modules (classes and methods) should not be forced to depend upon interfaces that they do not use.**

In object oriented programming abstractions are a crucial part. We use serveral interfaces or abstract classes in order to achieve abstraction.

Sometimes we want to implement a given interface but just fot the sake of some methods defined by that interface. We can end up with fat interfaces - containg more methods that the actual class needs.

* No client should not be forced to depend on methods it does not use.

* When it is possible we should **break our interfaces in many smaller ones** so they better satisfy the exact needs of our clients.

Breaking Interface Segreation Principle also breaks Single Responsability Principle.