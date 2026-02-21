package Creational.AbstractFactory.com.example.abstractFactory;

import Creational.AbstractFactory.com.example.employee.Employee;
import Creational.AbstractFactory.com.example.employee.Manager;


public class ManagerFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new Manager();
    }

}
