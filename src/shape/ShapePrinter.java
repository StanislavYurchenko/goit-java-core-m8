package shape;

public class ShapePrinter {
    public static void printShape(Shape shape) {
        if (shape == null) {
            System.out.println("Shape is null!");
            return;
        }

        System.out.println("Name: " + shape.getName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("------------------------");

    }
}