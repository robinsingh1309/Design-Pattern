package Behavioral.Memento.com.example.caretaker;

import java.util.ArrayList;
import java.util.List;

import Behavioral.Memento.com.example.memento.ConfigMemento;


public class ConfigCareTaker {

    // Fields
    private List<ConfigMemento> mementos;


    // Constructors
    // ---------------------------------------------

    public ConfigCareTaker() {
        this.mementos = new ArrayList<ConfigMemento>();
    }


    // Methods
    // ---------------------------------------------

    public void addMemento(ConfigMemento memento) {
        this.mementos.add(memento);
    }

    public ConfigMemento getMemento(int index) {
        return this.mementos.get(index);
    }

}
