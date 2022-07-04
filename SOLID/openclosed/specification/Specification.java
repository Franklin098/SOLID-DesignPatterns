package SOLID.openclosed.specification;

// adding abstractions to implement Open-Closed Principle
public interface Specification<T> {
    // look if an object of any type T satisfies an specification
    boolean isSatisfied(T item);
}
