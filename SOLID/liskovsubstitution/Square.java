package SOLID.liskovsubstitution;

// breaking the Liskov Substitution Principle
// Square is just a special type of Rectangle with height = width, so you try to use inheritance
public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    // Our setters for square are doing something pretty anoying, they are changing
    // both width and height without not let it know to anyone. What if this would
    // be a package use at massive scale?. Doesn't seems to have a good behaviour.
    @Override
    public void setWidth(int width) {
        // we want to make sure that the square continues to be a square
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        // we want to make sure that the square continues to be a square
        super.setHeight(height);
        super.setWidth(height);
    }

}
