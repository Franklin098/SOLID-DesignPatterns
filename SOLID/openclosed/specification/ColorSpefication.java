package SOLID.openclosed.specification;

import SOLID.openclosed.Color;
import SOLID.openclosed.Product;

public class ColorSpefication implements Specification<Product> {

    private Color color;

    public ColorSpefication(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == this.color;
    }

}
