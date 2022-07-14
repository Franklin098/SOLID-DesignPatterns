package creational.factories.animalsfactory;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal(AnimalTypes.DOG);
        dog.eat();
        Animal cat = AnimalFactory.getAnimal(AnimalTypes.CAT);
        cat.eat();

    }
}
