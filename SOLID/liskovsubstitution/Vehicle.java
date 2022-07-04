package SOLID.liskovsubstitution;

public class Vehicle {
    private String type;
    private int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }

    public void slowDown() {
        System.out.println("Vehicle is slowing down...");
    }

    public void fuel() {
        System.out.println("Vehicle fuel method...");
    }

    @Override
    public String toString() {
        return "Vehicle [age=" + age + ", type=" + type + "]";
    }

}
