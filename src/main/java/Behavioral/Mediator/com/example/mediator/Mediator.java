package Behavioral.Mediator.com.example.mediator;

import Behavioral.Mediator.com.example.colleague.Colleague;


public interface Mediator {

    void sendPrivateMessage(Colleague from, Colleague to, String message);

    void sendBrodcastMessage(Colleague from, String message);

    void registerColleague(Colleague colleague);
}
