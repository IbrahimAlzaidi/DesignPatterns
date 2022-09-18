package CreationalDesigns.AbstractFactoryMethod;

public class Client {
    public static void main(String[] args)
    {
      AbstractShapeFactory shapeFactory = FactoryProducer.getShapeFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

      AbstractColorFactory colorFactory = FactoryProducer.getColorFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
        Color color3 = colorFactory.getColor("GREEN");
        color3.fill();
    }
}
