package CreationalDesigns.Builder;

interface BuilderInterface {
    void buildBody();
    void insertWheel();
    void addHeadLight();
    Product getVehicle();
}