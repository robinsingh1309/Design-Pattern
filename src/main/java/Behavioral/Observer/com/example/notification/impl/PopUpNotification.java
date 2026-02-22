package Behavioral.Observer.com.example.notification.impl;

import Behavioral.Observer.com.example.notification.Notification;


public class PopUpNotification implements Notification {

    // Fields


    // Constructors
    // -------------------------------------------------


    // Methods
    // -------------------------------------------------

    @Override
    public void sendNotification(String userName, String videoURL) {
        System.out.println("Sending pop-up notification to "+ userName +" with video url: " + videoURL);
    }

}
