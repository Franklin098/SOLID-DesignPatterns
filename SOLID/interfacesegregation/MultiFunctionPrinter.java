package SOLID.interfacesegregation;

public class MultiFunctionPrinter implements Machine {

    // everything is okay here, because a MultiFunctionPrinter uses all this
    // methods.

    @Override
    public void print(Document d) {
        // ...
    }

    @Override
    public void fax(Document d) {
        // ...
    }

    @Override
    public void scan(Document d) {
        // ...
    }

}
