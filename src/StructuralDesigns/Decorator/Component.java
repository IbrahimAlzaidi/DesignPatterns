package StructuralDesigns.Decorator;

abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component{

    @Override
    public void doJob() {
        System.out.println("I'm from a Concrete Component - I am closed for modification");
    }
}