package CreationalDesigns.Builder;

public class Client {
    public static void main(String[] args){
        System.out.println("*** CreationalDesigns.Builder Pattern Demo *** \n");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        // Making a Car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        //Making Motor
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}
