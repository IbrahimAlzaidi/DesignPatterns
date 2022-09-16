package Singleton.BillPughApproach;

public class Singleton {

    //an instance attribute
    private int data = 0;

   /*
    * The Singleton Constructor should be private
    * No Client can instantiate an object
    */
    private Singleton(){}

    // Nested Class is referenced after getInstance() is Called.
    private static class SingletonHelper{
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance()
    {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData() {
        return data;
    }
}
