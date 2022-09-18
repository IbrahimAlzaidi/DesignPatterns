package CreationalDesigns.Singleton.SynchronizedMethod;

public class Client {
    public static void main(String[] args){
        // Now its thread Safe
        Singleton s = Singleton.getInstance();
        s.setData(10);

        System.out.println("First Reference" + s);
        System.out.println("CreationalDesigns.Singleton data value is: " + s.getData());

        // Get another reference to CreationalDesigns.Singleton
        // Is it the same object?
        s = null;
        s = Singleton.getInstance();

        System.out.println("First Reference" + s);
        System.out.println("CreationalDesigns.Singleton data value is: " + s.getData());
    }
}
