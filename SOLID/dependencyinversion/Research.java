package SOLID.dependencyinversion;

import java.util.List;

import org.javatuples.Triplet;

public class Research {

    // Here Research is our high-level module
    // Relationships is our low-level module
    // Breaking Dependency Inversion Principle: our high-level module is heavely
    // relying on a low-level module passing it by its constructor.
    @Deprecated
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

    // solving without breaking Dependency Inverison Principle
    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.fiandAllChildrenOf("John");
        children.forEach(p -> System.out.println("John has a child called: " + p.name));
    }
}
