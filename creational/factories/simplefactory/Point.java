package creational.factories.simplefactory;

public class Point {
    private double x, y;

    /**
     * We are obligated to create some ugly documentation:
     * 
     * @param a  is x if cartesian or rho if polar
     * @param b  is y if cartesian or theta if polar
     * @param cs
     */
    // fixing with enum since overload of constructors doesn't work in Java
    private Point(double a, double b, CoordinateSystem cs) {
        // the constuctor is ugly, it is not descriptive. What is a ? what is b ?
        switch (cs) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
            default:
                break;
        }

    }

    // with factories, private constructors are very useful
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Imagine we want to also init the Point with Polar Coordinates
    // Without a Factory
    /*
     * public Point(double rho, double theta){
     * thix.x = rho * Math.cos(theta);
     * this.y = rho * Math.sin(theta);
     * }
     * 
     * But this is not possible since Java doesn't support constructors with same
     * signature Point(double , double)
     */

    // Solving with Factories
    public static class Factory {

        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            double x = rho * Math.cos(theta);
            double y = rho * Math.sin(theta);
            return new Point(x, y);
        }
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
