package FactoryMethod.ConcreteCreator;

public class Client {
    public static void main(String[] args) {
        // without using Static in shape Factory.
        // ShapeFactory shapeFactory = new ShapeFactory();

        // with using static ShapeFactory Method.
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
