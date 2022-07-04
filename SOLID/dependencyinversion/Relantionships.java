package SOLID.dependencyinversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

// low-level module
public class Relantionships implements RelationshipBrowser {
    // it simply provide data access operations
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    @Override
    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    // low-level implementations of searching should be here.
    @Override
    public List<Person> fiandAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2).collect(Collectors.toList());
    }
}
