package Behavioral.Observer.com.example.observable;

import Behavioral.Observer.com.example.observer.Subscriber;


public interface Youtube<V> {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();

    void setData(V data);

    V getData();

}
