package Creational.AbstractFactory.com.example.employee;

public class AndroidDev implements Employee {

    @Override
    public int salary() {
        System.out.print("Android Developer Salary :: Rs ");
        return 35_000;
    }

}
