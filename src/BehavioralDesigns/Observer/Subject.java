package BehavioralDesigns.Observer;


import java.util.ArrayList;
import java.util.List;

public interface Subject {
    // methods to register and unregister observers.
    public void register(Observer obj);

    public void unregister(Observer obj);

    // method to notify observers of changes
    public void notifyObservers();

    // method to get updates from subject, not required, but ,added so observers can query
    public Object getUpdate(Observer obj);
}

class MyTopic implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null pointer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        if (!changed) return;
        observersLocal = new ArrayList<>(this.observers);
        this.changed =false;
        for (Observer obj: observersLocal){
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // method to post message to topic, change state
    public void postMessage(String msg){
        System.out.println("Message posted to Topic: "+msg);
        this.message = msg;
        this.changed =true;
        notifyObservers();
    }
}