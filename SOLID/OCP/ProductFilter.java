package SOLID.OCP;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    // Naive approach
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    // now we also want to filter by size
    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    // now we also want to filter by color and size
    // we are perfoming modifications of code that has been already tested and
    // deployed in production
    public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.size == size && p.color == color);
    }

    // now we have just 2 different criterias (size and color), but now imagine that
    // we want to add 100 different filter criterias, you will be adding
    // more and more repetitive code, adding things to code that has already been
    // tested
}
