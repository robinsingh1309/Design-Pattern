package Behavioral.Observer.com.example.observable.impl;

import java.util.ArrayList;
import java.util.List;

import Behavioral.Observer.com.example.observable.Youtube;
import Behavioral.Observer.com.example.observer.Subscriber;


public class YoutubeImpl implements Youtube<String> {

    // Fields

    private List<Subscriber> subsList = new ArrayList<>();
    private String data;


    // Methods
    // ---------------------------------------------------

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subsList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subsList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subsList) {
            subscriber.update();
        }
    }

    @Override
    public void setData(String val) {
        this.data = val;
        notifySubscribers(); // this is the place where Observer trigger
    }

    @Override
    public String getData() {
        return data;
    }

}
