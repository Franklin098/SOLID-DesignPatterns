package creational.factories.abstractfactory;

public class PetrolToyotaCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Petrol Toyota Car");
    }
}
