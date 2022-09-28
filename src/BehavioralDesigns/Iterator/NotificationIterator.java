package BehavioralDesigns.Iterator;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;
    //maintains curr pos of iterator over the array.
    int pos = 0;

    // Constructor takes the array of notificationList are going to iterate over.
    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Notification notification = notificationList[pos];
        pos += 1;
        return notification;
    }
}