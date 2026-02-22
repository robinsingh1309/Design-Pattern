package Behavioral.Observer.com.example.notification.impl;

import Behavioral.Observer.com.example.notification.Notification;


public class EmailNotification implements Notification {

    // Fields

    private String email;


    // Constructors
    // -------------------------------------------------

    public EmailNotification(String email) {
        this.email = email;
    }


    // Methods
    // -------------------------------------------------

    @Override
    public void sendNotification(String userName, String videoURL) {
        System.out.println("Sending email notification to " + email + ": New video uploaded: " + videoURL);
    }

}
