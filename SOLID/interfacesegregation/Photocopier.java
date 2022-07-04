package SOLID.interfacesegregation;

public class Photocopier implements Printer, Scanner {

    @Override
    public void scan(Document d) {
        // ...
    }

    @Override
    public void print(Document d) {
        // ...
    }
}
