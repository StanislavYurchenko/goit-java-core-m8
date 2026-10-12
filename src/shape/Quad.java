package shape;

public class Quad extends Shape {
    private final double side;

    public Quad(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
