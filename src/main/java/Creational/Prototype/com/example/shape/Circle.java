package Creational.Prototype.com.example.shape;


public class Circle implements Cloneable {

    // Fields

    private int radius;
    public String color;
    public Border border;


    // Constructors
    // -------------------------------------------------------

    public Circle(int radius, String color, Border border) {
        this.radius = radius;
        this.color = color;
        this.border = border;
    }


    // Methods
    // -------------------------------------------------------

    @Override
    public Object clone() throws CloneNotSupportedException {

        Circle cloned = (Circle) super.clone();
        cloned.border = new Border(this.border.thickness);

        return cloned;
    }


    // Object Methods
    // -------------------------------------------------------

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", border=" + border + "]";
    }


}
