package Builder;

public class MotorCycle implements BuilderInterface{

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body a MotorCycle");
    }

    @Override
    public void insertWheel() {
        product.add("2 Wheels are added");
    }

    @Override
    public void addHeadLight() {
        product.add("1 Headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
