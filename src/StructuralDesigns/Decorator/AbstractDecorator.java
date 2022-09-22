package StructuralDesigns.Decorator;

abstract class AbstractDecorator extends Component {
    protected Component com;

    public void setTheComponent(Component c) {
        this.com = c;
    }

    @Override
    public void doJob() {
        if (com != null){
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx1 extends AbstractDecorator{
    @Override
    public void doJob() {
        super.doJob();
        // Add additional responsibilities.
        System.out.println("I am explicit from Ex1");
    }
}

class ConcreteDecoratorEx2 extends AbstractDecorator{
    @Override
    public void doJob() {
        System.out.println(" ");
        System.out.println("*** Start Ex2 ***");
        super.doJob();
        // Add additional responsibilities.
        System.out.println("I am explicit from Ex2");
        System.out.println("*** End Ex2 ***");
    }
}