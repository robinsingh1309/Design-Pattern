package Behavioral.Mediator.com.example.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import Behavioral.Mediator.com.example.colleague.Colleague;
import Behavioral.Mediator.com.example.mediator.Mediator;


public class ChatMediator implements Mediator {

    // Fields

    private List<Colleague> colleagues = new ArrayList<Colleague>();


    // Methods
    // ---------------------------------------------------------------------------

    @Override
    public void sendPrivateMessage(Colleague from, Colleague to, String message) {

        for (Colleague colleague : colleagues) {
            if (colleague == to) {
                colleague.receiveMessage(from, message);
                break;
            }
        }
    }

    @Override
    public void sendBrodcastMessage(Colleague from, String message) {

        for (Colleague colleague : colleagues) {

            if (colleague != from) {
                colleague.receiveMessage(from, message);
            }
        }
    }

    @Override
    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

}
