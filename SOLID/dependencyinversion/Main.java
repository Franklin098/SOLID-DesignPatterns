package SOLID.dependencyinversion;

public class Main {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        // Breaking Dependency Inversion Principle
        Relantionships relationships = new Relantionships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        // Research research = new Research(relationships);

        // Using abstractios to Implement Dependency Inverison Principle
        RelationshipBrowser browser = new Relantionships();
        browser.addParentAndChild(parent, child1);
        browser.addParentAndChild(parent, child2);

        Research research2 = new Research(browser);
        research2.toString();
    }
}
