# OCP: Open-Closed Principle

Classes, modules should be open for extension (inheritance), but closed for modification (changes in the existing code).

* The OCP states that the design and writting of the code should be done in a way that new functionality should be added with minimum changes in the existing code.

We have to design every new module such taht if we add a new behaviour then we do not have to change the existing modules.

Specification Design Pattern:

Imagine you want to create a website and you want to allow your users to filter products by different criterias.

Look at the ProductFilter.java class to see a Naive approach without using Open-Closed principle.

You'll need to add more and more filter methods, so you are modifying already tested code in production.

Instead with the specification pattern we can create abstractions with Filter and Specification interfaces and then use them when we want more and new filters.

We can create NEW specification classes that EXTENDS the existing Specification interface