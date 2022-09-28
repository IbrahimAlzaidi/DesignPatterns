package BehavioralDesigns.Iterator;

public class NotificationBar {
    NotificationCollection notification;
    public NotificationBar(NotificationCollection notification){
        this.notification =notification;
    }
    public void printNotification(){
        Iterator iterator = notification.createIterator();
        System.out.println("--- NotificationBar ---");
        while (iterator.hasNext()){
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}