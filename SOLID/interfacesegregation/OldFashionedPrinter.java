package SOLID.interfacesegregation;

// Breaking Interface Segregation Principle
public class OldFashionedPrinter implements Machine {

    // an OldFashinedPrinter does not have all the functionality of the Machine
    // interface
    // we only need some methods, not all of them.
    @Override
    public void print(Document d) {
        // ... an OldFashined can print documents
    }

    @Override
    public void fax(Document d) {
        // ... and OldFashined printer cannot fax documentes.
        // We can leave the method empty, you still given the user of OldFashinedPrinter
        // that this printer does support the fax operation, so your code is not clear.
        // Another alternative is throw an Exception but we are breaking
        // LiskovSubstitution principle
    }

    @Override
    public void scan(Document d) {
        // ... and OldFashined scan cannot fax documentes.
        // We can leave the method empty, you still given the user of OldFashinedPrinter
        // that this printer does support the fax operation, so your code is not clear.
        // Another alternative is throw an Exception but we are breaking
        // LiskovSubstitution principle
    }

}
