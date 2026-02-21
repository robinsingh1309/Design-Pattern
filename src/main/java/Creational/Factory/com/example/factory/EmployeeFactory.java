package Creational.Factory.com.example.factory;

import Creational.Factory.com.example.employee.AndroidDev;
import Creational.Factory.com.example.employee.Employee;
import Creational.Factory.com.example.employee.WebDev;


public final class EmployeeFactory {

    // Fields
    public static final String ANDROID = "android";
    public static final String WEB = "web";


    // Constructor
    // ----------------------------------------------------
    private EmployeeFactory() {}


    // Factory Method
    public static Employee getEmployee(String designation) {

        String role = designation.trim().toLowerCase();

        if (role.equals(ANDROID))
            return new AndroidDev();
        else if (role.equals(WEB))
            return new WebDev();
        else
            return null; // Only for example I have illustrated two roles
    }


}
