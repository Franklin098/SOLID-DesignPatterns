package creational.factories.abstractfactory;

public class ElectricToyotaCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Electric Toyota Car");
    }
}
