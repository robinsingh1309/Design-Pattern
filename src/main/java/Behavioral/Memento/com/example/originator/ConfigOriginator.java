package Behavioral.Memento.com.example.originator;

import Behavioral.Memento.com.example.memento.ConfigMemento;


public class ConfigOriginator {

    // Fields

    private int height;
    private int width;


    // Constructors
    // ---------------------------------------------

    public ConfigOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }


    // Setters and Getters
    // ---------------------------------------------

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }


    // Methods
    // ---------------------------------------------

    public ConfigMemento createMemento() {
        return new ConfigMemento(height, width);
    }

    public void restore(ConfigMemento memento) {
        this.height = memento.getHeight();
        this.width = memento.getWidth();
    }


    // Object Methods
    // ---------------------------------------------

    @Override
    public String toString() {
        return "ConfigOriginator [height=" + height + ", width=" + width + "]";
    }

}
