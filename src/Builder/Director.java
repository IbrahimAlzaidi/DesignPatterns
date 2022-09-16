package Builder;

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheel();
        myBuilder.addHeadLight();
    }
}