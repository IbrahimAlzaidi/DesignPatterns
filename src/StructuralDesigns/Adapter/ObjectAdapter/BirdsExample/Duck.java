package StructuralDesigns.Adapter.ObjectAdapter.BirdsExample;

interface Duck {
    public void quark();
    public void fly();
}

class MallardDuck implements Duck{

    @Override
    public void quark() {
        System.out.println("Quark");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
