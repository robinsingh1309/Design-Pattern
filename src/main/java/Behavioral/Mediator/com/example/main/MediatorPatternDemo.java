package Behavioral.Mediator.com.example.main;

import Behavioral.Mediator.com.example.colleague.Colleague;
import Behavioral.Mediator.com.example.colleague.impl.UserColleague;
import Behavioral.Mediator.com.example.mediator.Mediator;
import Behavioral.Mediator.com.example.mediator.impl.ChatMediator;
import Creational.Builder.com.example.user.User;


public class MediatorPatternDemo {

    public static void main(String[] args) {

        Mediator chatMediator = new ChatMediator();

        User user1 = new User.UserBuilder().setName("Robin").setAge(25).setEmail("robin@example.com").build();
        User user2 = new User.UserBuilder().setName("Sai").setAge(22).setEmail("sai@example.com").build();
        User user3 = new User.UserBuilder().setName("Ankit").setAge(22).setEmail("ankit@example.com").build();
        User user4 = new User.UserBuilder().setName("Joshi").setAge(21).setEmail("joshi@example.com").build();

        Colleague robin = new UserColleague(user1, chatMediator);
        Colleague sai = new UserColleague(user2, chatMediator);
        Colleague ankit = new UserColleague(user3, chatMediator);
        Colleague joshi = new UserColleague(user4, chatMediator);

        System.out.println("---- Private Message ----");
        robin.sendPrivateMessage(sai, "Hi Sai!");

        System.out.println("\n---- Broadcast Message ----");
        sai.sendBrodcastMessage("Hello everyone!");

    }

}
