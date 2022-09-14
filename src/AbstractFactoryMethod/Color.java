package AbstractFactoryMethod;

interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::Fill() method.");
    }
}
class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::Fill() method.");
    }
}
class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::Fill() method.");
    }
}