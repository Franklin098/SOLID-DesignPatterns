package SOLID.OCP.specification;

import SOLID.OCP.Color;
import SOLID.OCP.Product;

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
