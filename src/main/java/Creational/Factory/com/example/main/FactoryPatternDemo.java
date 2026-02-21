package Creational.Factory.com.example.main;

import static Creational.Factory.com.example.factory.EmployeeFactory.ANDROID;
import static Creational.Factory.com.example.factory.EmployeeFactory.WEB;

import Creational.Factory.com.example.employee.Employee;
import Creational.Factory.com.example.factory.EmployeeFactory;


public class FactoryPatternDemo {

    public static void main(String[] args) {

        // Retrieving the salary of Android Developer
        Employee androidDeveloper = EmployeeFactory.getEmployee(ANDROID);

        int androidDeveleoperSalary = androidDeveloper.salary();
        System.out.println(androidDeveleoperSalary);

        // Retrieving the salary of Web Developer
        Employee webDeveloper = EmployeeFactory.getEmployee(WEB);

        int webDeveleoperSalary = webDeveloper.salary();
        System.out.println(webDeveleoperSalary);
    }


}
