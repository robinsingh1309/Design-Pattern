package Behavioral.Memento.com.example.memento;


public class ConfigMemento {

    // Fields

    private final int height;
    private final int width;


    // Constructors
    // ------------------------------------------

    public ConfigMemento(int height, int width) {
        this.height = height;
        this.width = width;
    }


    // Getters
    // ------------------------------------------

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    // Object Methods
    // ------------------------------------------

    @Override
    public String toString() {
        return "ConfigMemento [height=" + height + ", width=" + width + "]";
    }

}
