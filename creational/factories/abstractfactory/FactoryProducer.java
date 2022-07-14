package creational.factories.abstractfactory;

// Factory of factories
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType.equals("ELECTRIC"))
            return new ElectricFactory();
        else
            return new PetrolFactory();
    }
}
