# SOLID Design Principles

A set of software design principles intrudeced by Robert C. Martin.

These principes help to create clean and reusable code.

# SRP: Single Responsability Principle

**Every class or method should have a single primary responsability, a single reason to change.**

If a class has a lot of responsabilities, then it becomes a God Class, which is an anti-pattern.

* Separation of concerns.
* Always take a look wich is the esencial responsability (methods, behaviors) that a class should have.
* Separate in multiple classes if necessary, each of them with a clear single responsability.

God classes are difficult to refactor, to test and read.

# OCP: Open-Closed Principle

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