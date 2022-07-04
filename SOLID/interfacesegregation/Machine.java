package SOLID.interfacesegregation;

public interface Machine {

    // You shouln't put in your interface more that what the client is expected to
    // implement.
    // Do not create huge interfaces. Think very well its single responsability.
    // Lets segregate, split the Machine interface in multiple interfaces.
    void print(Document d);

    void fax(Document d);

    void scan(Document d);
}
