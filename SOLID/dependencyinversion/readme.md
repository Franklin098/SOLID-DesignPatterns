# Dependency Inversion Example

Family Tree application, to handle relationship between people.

Relationships is a low-level module, it just provides data-storage operations, like saving a new relationship, or reading from it.

Research is a high-level module, we want to do some queries there. Research relies on Relationships low-level module (data storage) to get the information, manipulate it and do some queries.

The end user doesn't care about how we are storing the information, they just care about the high-level module.

**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

Breaking Dependency Inversion Principle: our high-level module is heavely relying on a low-level module passing it by its constructor.

We are doing low-level operations (search for data in our data-storage service) in a high-level module.

The search operation should be implemented in the low level module

```
public Research(Relantionships relantionships) {
        List<Triplet<Person, Relationship, Person>> relations = relantionships.getRelations();

        // find all the parents whoes name is "John"
        relations.stream()
                .filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
                .forEach(triplet -> System.out.println("John has a child called: " + triplet.getValue2().name));
        // we are breaking the Dependency Inversion Principle because we are doing
        // low-level operations (search for data in our data-storage service) in a
        // high-level module.
    }
```

How to solve it ?

We should depend on abstractions. We can create an Interface -> RelationshipBrowser.

Put the search opeartion in the low-level module -> inside Relationships, and remove it form the high-level module (Research)

With a direct dependency on a low-level module if we change the low-level implementation, we'll need to also refactor a lot of code and logic in our high-level module.

If we want to do not use a List and Triplets for our implementation of Relationships anymore, we can do it now without affecting our Research high-level module, we won't have to change any line of code on it.