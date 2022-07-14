package creational.factories.simplefactory;

public class Main {
    public static void main(String[] args) {
        // With private constructors users know that there is no way to create
        // an object usint a constructor, they should use the Factories
        Point p1 = Point.Factory.newPolarPoint(5, Math.PI);

        Point p2 = Point.Factory.newCartesianPoint(20, 30);

        System.out.println("P1: " + p1.toString() + " P2: " + p2.toString());
    }
}
