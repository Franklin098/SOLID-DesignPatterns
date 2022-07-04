# Liskov Substitution Principle Demo

**Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application**


### Rectangle and Square example

Our setters for square are doing something pretty anoying, they are changing both width and height without not let it know to anyone. What if this would be a package use at massive scale?. Doesn't seems to have a good behaviour.

If we replace Square by its super class (Rectangle) it has a weird and bad behaviour so we are violating Liskov Substitution principle.

### Vehicle, PetrolCar and ElectricCar example

An electric car have doesn't support a fuel() method, it doesn't make sense. So if we throw and exception in the fuel() method for ElectricCar, then we cannot replace ElectricCar by its super class (Vehicle) in all escenarios, since we are going to get errors an unexpected behaviour.

```
Vehicle electicCar = new ElectricCar("Tesla", 2);
electicCar.fuel(); // Design Smells
```

A Dising Smell is a good hint that our architectural design is not the best one possible.

In this case the Vehicle is not a good parent class the fuel() method should not be there, or we could name it different.

We can also use interfaces or abstract classes and abstract methods without body and that each child class should define how to define it.

Instead of using just one single interface, we can use many of them with specific and well define responsabilities.