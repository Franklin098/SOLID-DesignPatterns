package creational.factories.abstractfactory;

public class ElectricFordCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Electric Ford Car");
    }
}