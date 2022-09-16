package Singleton.DoubleCheckedLocking;

public class Singleton {
    //the private reference to the only instance
    // we will add volatile keyword to solve the previous problem
    //bottleneck
    private volatile static Singleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    /*
     * The Singleton Constructor should be private
     * No Client can instantiate an object
     */
    private Singleton(){}
    // by adding synchronized keyword to getInstance(),
    // we force every thread to wait its turn before
    // it can enter the method.
    public static  Singleton getInstance()
    {
        if (uniqueInstance == null){
            synchronized (Singleton.class){ // we only synchronized the first time through
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData() {
        return data;
    }
}

