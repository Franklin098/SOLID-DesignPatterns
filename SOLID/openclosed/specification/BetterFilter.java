package SOLID.openclosed.specification;

import java.util.List;
import java.util.stream.Stream;

import SOLID.openclosed.Product;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(p -> specification.isSatisfied(p));
    }

}
