package SOLID.OCP.specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    // we can filter every type of item <T> using any kind of specification <T>
    Stream<T> filter(List<T> items, Specification<T> specification);
}
