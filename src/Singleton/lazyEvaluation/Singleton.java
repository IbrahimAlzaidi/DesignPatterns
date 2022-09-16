package Singleton.lazyEvaluation;

public class Singleton {
    //the private reference to the only instance
    private static Singleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

   /*
    * The Singleton Constructor should be private
    * No Client can instantiate an object
    */
    private Singleton(){}

    public static Singleton getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData() {
        return data;
    }
}
