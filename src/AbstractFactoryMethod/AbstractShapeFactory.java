package AbstractFactoryMethod;

public abstract class AbstractShapeFactory {
    abstract Shape getShape(String shape);
}
class ShapeFactory extends AbstractShapeFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        else if (shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }

}

abstract class AbstractColorFactory {
    abstract Color getColor(String color);
}
class ColorFactory extends AbstractColorFactory{

    @Override
    Color getColor(String color) {
        if (color == null)
            return null;
        else if (color.equalsIgnoreCase("RED"))
            return new Red();
        else if (color.equalsIgnoreCase("GREEN"))
            return new Green();
        else if (color.equalsIgnoreCase("BLUE"))
            return new Blue();

        return null;
    }
}