# Interface Segregation Example

The Machine interface has to many different methods with different responsabilities and concerns.

* You shouln't put in your interface more that what the client is expected to implement.

* Do not create huge interfaces. Think very well its single responsability.

A MultiFunctionPrinter uses all the Machine interface methods so it is okay.

An OldFashinedPrinter does not have all the functionality of the Machine interface. We only need some methods, not all of them.

OldFashinedPrinter cannot fax documentes. We can leave the method empty, you still given the user of OldFashinedPrinter that this printer does support the fax operation, so your code is not clear.

Another alternative is throw an Exception but we are breaking LiskovSubstitution principle.

> Lets segregate, split the Machine interface in multiple interfaces.

Now, we split the Machine interface in 3 well defined interfaces: Fax, Printer and Scanner. Each of them with a well defined responsability and concern.

We implement the 3 interfaces in MultiFunction Printer, and only 1 of them in OldFashinedPrinter.

```
public class JustAPrinter implements Printer {

    @Override
    public void print(Document d) {
        // we just imprement the interfaces that we need
    }
}
```

```
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

```

**YAGNY = You Ain't Going to Need It.**

You can also create middle interfaces that extends multiple interfaces.

```
public interface MultiFunctionDevice extends Printer, Scanner {

}
```

Decorator pattern can also help.

**Always put the minimum amount of methods inside an interface, so at no point a developer is going to be forced to implement a method that don't use it at all.**