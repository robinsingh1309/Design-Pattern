package Behavioral.Observer.com.example.observer.impl;

import Behavioral.Observer.com.example.notification.Notification;
import Behavioral.Observer.com.example.observable.Youtube;
import Behavioral.Observer.com.example.observer.Subscriber;


public class SubscriberImpl implements Subscriber {

    private final Youtube<String> youtubeObservable;
    private final Notification notification;


    // Fields

    private final String subsName;


    // Constructors
    // ---------------------------------------------------

    public SubscriberImpl(String subsName, Youtube<String> youtubeObservable, Notification notification) {
        this.subsName = subsName;
        this.youtubeObservable = youtubeObservable;
        this.notification = notification;
    }


    // Methods
    // ---------------------------------------------------

    @Override
    public void update() {
        notification.sendNotification(subsName, youtubeObservable.getData());
    }

}
