package Behavioral.Mediator.com.example.colleague.impl;

import Behavioral.Mediator.com.example.colleague.Colleague;
import Behavioral.Mediator.com.example.mediator.Mediator;
import Creational.Builder.com.example.user.User;


public class UserColleague implements Colleague {

    // Fields

    private Mediator mediator;
    private User user;


    // Constructor
    // ----------------------------------------------------------

    public UserColleague(User user, Mediator mediator) {

        this.user = user;

        this.mediator = mediator;
        mediator.registerColleague(this);
    }


    // Methods
    // ----------------------------------------------------------

    @Override
    public void sendPrivateMessage(Colleague to, String message) {
        mediator.sendPrivateMessage(this, to, message);
    }

    @Override
    public void sendBrodcastMessage(String message) {
        mediator.sendBrodcastMessage(this, message);
    }

    @Override
    public void receiveMessage(Colleague from, String message) {
        UserColleague sender = (UserColleague) from;

        System.out.println("[" + user.getName() + "] message received from [" + sender.getUser().getName() + "] : " + message);
    }


    // Getters
    // ----------------------------------------------------------

    public User getUser() {
        return user;
    }

}
