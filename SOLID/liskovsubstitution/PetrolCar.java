package SOLID.liskovsubstitution;

public class PetrolCar extends Vehicle {

    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    public void speedUp() {
        System.out.println("Petrol Car is speeding up...");
    }

    @Override
    public void slowDown() {
        System.out.println("Petrol Car is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("Petrol Car fuel method...");
    }
}
