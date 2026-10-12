package shape;

public class Oval extends Shape {
    private final double radius1;
    private final double radius2;

    public Oval(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public String getName() {
        return "Oval";
    }

    @Override
    public double getArea() {
        return Math.PI * radius1 * radius2;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((radius1 * radius1 + radius2 * radius2) / 2);
    }
}