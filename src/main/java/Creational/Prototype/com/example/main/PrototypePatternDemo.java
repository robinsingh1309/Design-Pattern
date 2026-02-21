package Creational.Prototype.com.example.main;

import Creational.Prototype.com.example.shape.Border;
import Creational.Prototype.com.example.shape.Circle;


public class PrototypePatternDemo {

    public static void main(String[] args) {

        try {
            
            //--------------Before-------------------------
            Border border = new Border(2);

            Circle original = new Circle(5, "RED", border);
            Circle cloned = (Circle) original.clone();
            
            System.out.println(original);
            System.out.println(cloned);
            
            
            //--------------After--------------------------
            cloned.border.thickness = 10;
            
            System.out.println(original);
            System.out.println(cloned);
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
