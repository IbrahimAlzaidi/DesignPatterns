package StructuralDesigns.Adapter.ObjectAdapter.BirdsExample;

public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quark() {
    turkey.gobble();
    }

    @Override
    public void fly() {
    for (int i =0;i<5; i++)
        turkey.fly();
    }

}
