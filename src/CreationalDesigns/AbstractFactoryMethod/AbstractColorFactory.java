package CreationalDesigns.AbstractFactoryMethod;

abstract class AbstractColorFactory {
    abstract Color getColor(String color);
}
class ColorFactory extends AbstractColorFactory {

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