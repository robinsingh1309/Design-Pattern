package Creational.Prototype.com.example.shape;

public class Border {

    // Fields

    public int thickness;


    // Constructors
    // -----------------------------------------------

    public Border(int thickness) {
        this.thickness = thickness;
    }


    // Object Methods
    // -----------------------------------------------

    @Override
    public String toString() {
        return "Border [thickness=" + thickness + "]";
    }


}
