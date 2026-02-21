package Creational.AbstractFactory.com.example.employee;

public class WebDev implements Employee {

    @Override
    public int salary() {
        System.out.print("Web Developer Salary :: Rs ");
        return 30_000;
    }

}
