package SOLID.dependencyinversion;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> fiandAllChildrenOf(String name);

    void addParentAndChild(Person parent, Person child);
}
