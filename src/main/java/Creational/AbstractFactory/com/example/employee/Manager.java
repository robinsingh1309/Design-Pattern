package Creational.AbstractFactory.com.example.employee;

public class Manager implements Employee {

    @Override
    public int salary() {
        System.out.print("Manager Salary :: Rs ");
        return 60_000;
    }

}
