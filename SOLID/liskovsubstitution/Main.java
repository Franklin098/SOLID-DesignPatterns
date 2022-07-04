package SOLID.liskovsubstitution;

public class Main {

    // breaking the Liskov Substitution Principle
    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        // area should be -> width * 10
        System.out.println("Expected area of " + (width * 10) + " , but got: " + rectangle.getArea());
    }

    public static void main(String[] args) {
        // this works well
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        // Breaking the Liskov Substitution Principle, try to replace a derived class by
        // its super classs
        Rectangle square = new Square(5);
        useIt(square); // wrong answer: Expected area of 50 , but got: 100

        // Our setters for square are doing something pretty anoying, they are changing
        // both width and height without not let it know to anyone. What if this would
        // be a package use at massive scale?. Doesn't seems to have a good behaviour.

        // this works well
        Vehicle petrolCar = new PetrolCar("Ford", 6);
        petrolCar.speedUp();
        petrolCar.slowDown();
        petrolCar.fuel();

        // Breaking the Liskov Substitution Principle, try to replace a derived class by
        // its super classs
        Vehicle electicCar = new ElectricCar("Tesla", 2);
        electicCar.speedUp();
        electicCar.slowDown();
        electicCar.fuel(); // Design Smells
    }
}
