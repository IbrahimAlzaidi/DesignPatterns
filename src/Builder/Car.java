package Builder;

public class Car implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body a car");
    }

    @Override
    public void insertWheel() {
        product.add("4 Wheels are added");
    }

    @Override
    public void addHeadLight() {
        product.add("2 Headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
