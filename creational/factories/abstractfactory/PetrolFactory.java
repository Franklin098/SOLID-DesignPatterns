package creational.factories.abstractfactory;

public class PetrolFactory implements AbstractFactory {
    @Override
    public Car getCar(String type) {
        // the type helps to decide wich kind of car to create
        if (type == "FORD")
            return new PetrolFordCar();
        else
            return new PetrolToyotaCar();
    }
}
