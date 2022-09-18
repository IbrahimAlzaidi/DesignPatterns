package StructuralDesigns.Adapter.ObjectAdapter.ShapesExample;

public class Client {
    public static void main(String[] args){
        System.out.println("*** Adapter Pattern Demo ***");

        Triangle t = new Triangle(20,10);

        CalculatorInterface calculatorInterface = new CalculatorAdapter(t);

        System.out.println("Area of Triangle is : "+ calculatorInterface.getArea(null));

    }
}
