package creational.factories.animalsfactory;

public class AnimalFactory {

    // separate instantiation
    public static Animal getAnimal(AnimalTypes type) {
        switch (type) {
            case CAT:
                // we can hide the details of the actual instantion, do more steps
                // or change Cat class independently
                return new Cat();
            case DOG:
                return new Dog();
        }
        return null;
    }

}
