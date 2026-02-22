package Behavioral.Observer.com.example.main;

import Behavioral.Observer.com.example.notification.impl.EmailNotification;
import Behavioral.Observer.com.example.notification.impl.PopUpNotification;
import Behavioral.Observer.com.example.observable.impl.YoutubeImpl;
import Behavioral.Observer.com.example.observer.impl.SubscriberImpl;


public class ObserverPatternDemo {

    public static void main(String[] args) {

        // create a youtube channel
        YoutubeImpl youtubeImpl = new YoutubeImpl();

        // Creating subscriber
        SubscriberImpl youtubeSubscriber1 =
                new SubscriberImpl("Robin", youtubeImpl, new EmailNotification("robin@example.com"));
        SubscriberImpl youtubeSubscriber2 = new SubscriberImpl("Sai", youtubeImpl, new PopUpNotification());

        SubscriberImpl youtubeSubscriber3 =
                new SubscriberImpl("Jagdish", youtubeImpl, new EmailNotification("jagdish@example.com"));

        // subscribe to the channel
        youtubeImpl.addSubscriber(youtubeSubscriber1);
        youtubeImpl.addSubscriber(youtubeSubscriber2);
        youtubeImpl.addSubscriber(youtubeSubscriber3);

        // upload the video on channel and notifySubscribers will be automatically triggered
        youtubeImpl.setData("https://www.newVideoURL.com"); // giving random value


        // removing one subscriber
        youtubeImpl.removeSubscriber(youtubeSubscriber3);

        // just for testing purpose to see whether only 2 subscriber is now getting notified or not
        youtubeImpl.notifySubscribers();

    }

}
