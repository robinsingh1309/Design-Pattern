package Creational.AbstractFactory.com.example.main;

import Creational.AbstractFactory.com.example.Factory.EmployeeFactory;
import Creational.AbstractFactory.com.example.abstractFactory.AndroidDevFactory;
import Creational.AbstractFactory.com.example.abstractFactory.ManagerFactory;
import Creational.AbstractFactory.com.example.abstractFactory.WebDevFactory;
import Creational.AbstractFactory.com.example.employee.Employee;


public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        Employee androidDev = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(androidDev.salary());

        Employee webDev = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(webDev.salary());

        Employee manager = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(manager.salary());

    }

}
