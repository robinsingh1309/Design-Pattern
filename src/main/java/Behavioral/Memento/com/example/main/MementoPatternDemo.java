package Behavioral.Memento.com.example.main;

import Behavioral.Memento.com.example.caretaker.ConfigCareTaker;
import Behavioral.Memento.com.example.memento.ConfigMemento;
import Behavioral.Memento.com.example.originator.ConfigOriginator;


public class MementoPatternDemo {

    public static void main(String[] args) {

        ConfigCareTaker careTaker = new ConfigCareTaker();

        // Original State
        ConfigOriginator originator = new ConfigOriginator(10, 15);

        careTaker.addMemento(originator.createMemento());
        System.out.println("Original State: " + originator);


        originator.setHeight(20);
        originator.setWidth(30);

        careTaker.addMemento(originator.createMemento());
        System.out.println("Modified State: " + originator);


        // Switching / rollback to previous snapshot of object
        ConfigMemento memento = careTaker.getMemento(0);
        originator.restore(memento);
        
        System.out.println("Restored state: " + memento);
    }

}
