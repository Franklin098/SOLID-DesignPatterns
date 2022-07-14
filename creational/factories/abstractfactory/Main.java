package creational.factories.abstractfactory;

public class Main {
    public static void main(String[] args) {

        // FactoryProducer is a factory of other factories !

        AbstractFactory electricFactory = FactoryProducer.getFactory("ELECTRIC");
        Car fordElectric = electricFactory.getCar("FORD");
        fordElectric.assemble(); // prints its type

        AbstractFactory petrolFactory = FactoryProducer.getFactory("PETROL");
        Car toyotaPetrol = petrolFactory.getCar("TOYOTA");
        toyotaPetrol.assemble();

        Car fordPetrol = petrolFactory.getCar("FORD");
        fordPetrol.assemble();
    }
}
