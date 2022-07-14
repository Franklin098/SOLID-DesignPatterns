package creational.factories.abstractfactory;

public class PetrolFordCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Petrol Ford Car");
    }
}
