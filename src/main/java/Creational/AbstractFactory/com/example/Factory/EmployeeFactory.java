package Creational.AbstractFactory.com.example.Factory;

import Creational.AbstractFactory.com.example.abstractFactory.EmployeeAbstractFactory;
import Creational.AbstractFactory.com.example.employee.Employee;


public class EmployeeFactory {

    /**
     * Even the Factory does not know from which factory the object will come
     * AbstractFactory Pattern means Factory of Factories
     */
    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }


}
