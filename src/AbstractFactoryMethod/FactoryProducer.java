package AbstractFactoryMethod;

public class FactoryProducer {
    public static AbstractShapeFactory getShapeFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        return null;
    }

    public static AbstractColorFactory getColorFactory(String choice){
        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}