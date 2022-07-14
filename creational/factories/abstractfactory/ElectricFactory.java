package creational.factories.abstractfactory;

public class ElectricFactory implements AbstractFactory {
    @Override
    public Car getCar(String type) {
        // the type helps to decide wich kind of car to create
        if (type == "FORD")
            return new ElectricFordCar();
        else
            return new ElectricToyotaCar();
    }
}
