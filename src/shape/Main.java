package shape;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape quad = new Quad(5);
        Shape triangle = new Triangle(5, 2, 4);
        Shape rectangle= new Rectangle(1, 4);
        Shape oval = new Oval(7, 5);

        Shape[] shapes = {circle, quad, triangle, rectangle, oval};

        for (Shape shape : shapes) {
            ShapePrinter.printShape(shape);
        }
    }

}
