package SOLID.liskovsubstitution;

public class ElectricCar extends Vehicle {

    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    public void speedUp() {
        System.out.println("Electric Car is speeding up...");
    }

    @Override
    public void slowDown() {
        System.out.println("Electric Car is slowing down...");
    }

    @Override
    public void fuel() {
        // An electric have doesn't support a Fuel method, it doesn't make sense
        // breaking Liskov Substitution principle
        throw new Error("Electric Car cannot be fuel...");
    }
}
