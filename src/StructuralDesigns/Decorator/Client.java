package StructuralDesigns.Decorator;

public class Client {
    public static void main(String [] args){

        System.out.println("*** Decorator Pattern Demo ***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx1 cd_1 = new ConcreteDecoratorEx1();

        cd_1.setTheComponent(cc);
        cd_1.doJob();


        ConcreteDecoratorEx2 cd_2 = new ConcreteDecoratorEx2();

        cd_2.setTheComponent(cd_1);
        cd_2.doJob();
    }
}