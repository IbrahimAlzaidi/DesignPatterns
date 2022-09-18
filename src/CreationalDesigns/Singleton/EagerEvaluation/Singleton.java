package CreationalDesigns.Singleton.EagerEvaluation;

public class Singleton {
    //create an Instance, thread safe
    // this is Eager loading
    private static Singleton uniqueInstance = new Singleton();

    //an instance attribute
    private int data = 0;

   /*
    * The CreationalDesigns.Singleton Constructor should be private
    * No Client can instantiate an object
    */
    private Singleton(){}

    public static Singleton getInstance()
    {
        return uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData() {
        return data;
    }
}