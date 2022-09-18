package StructuralDesigns.Adapter.ObjectAdapter.ShapesExample;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle myTriangle){
        t= myTriangle;
    }
    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();

        r = new Rectangle();

        r.length = t.base;
        r.width = 0.5 * t.height;

        return calculator.getArea(r);
    }
}
