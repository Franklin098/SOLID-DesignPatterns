package SOLID.openclosed;

import java.util.List;

import SOLID.openclosed.specification.AndSpecification;
import SOLID.openclosed.specification.BetterFilter;
import SOLID.openclosed.specification.ColorSpefication;
import SOLID.openclosed.specification.SizeSpecification;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.HUGE);

        List<Product> products = List.of(apple, tree, house);

        // Old approach not using Open-Closed principle
        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (Old implementation): ");
        pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - " + p.name + " is Green"));

        // Better approach using Open-Closed principle
        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products (Better implementation): ");
        betterFilter.filter(products, new ColorSpefication(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is Green"));

        // If we want more filters using new specifications we don't have to go to the
        // already written classes and - modify them by adding more code -
        // We can create NEW specification classes that EXTENDS the existing
        // Specification interface

        System.out.println("Huge and Blue products (Better implementation): ");
        betterFilter.filter(products,
                new AndSpecification<>(new ColorSpefication(Color.BLUE), new SizeSpecification(Size.HUGE)))
                .forEach(p -> System.out.println(" - " + p.name + " is Huge and Blue"));

    }
}
