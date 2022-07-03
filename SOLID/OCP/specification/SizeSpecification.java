package SOLID.OCP.specification;

import SOLID.OCP.Product;
import SOLID.OCP.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == this.size;
    }

}
