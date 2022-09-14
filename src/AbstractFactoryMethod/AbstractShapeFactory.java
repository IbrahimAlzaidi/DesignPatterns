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

