package Creational.AbstractFactory.com.example.abstractFactory;

import Creational.AbstractFactory.com.example.employee.Employee;
import Creational.AbstractFactory.com.example.employee.WebDev;


public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new WebDev();
    }

}
