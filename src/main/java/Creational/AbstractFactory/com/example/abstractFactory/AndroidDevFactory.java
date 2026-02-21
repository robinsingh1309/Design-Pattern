package Creational.AbstractFactory.com.example.abstractFactory;

import Creational.AbstractFactory.com.example.employee.AndroidDev;
import Creational.AbstractFactory.com.example.employee.Employee;


public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }

}
