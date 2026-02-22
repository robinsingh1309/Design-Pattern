package Behavioral.Strategy.com.example.payment.strategy;

import Behavioral.Strategy.com.example.payment.Payment;


public class UPIStrategy implements Payment {

    // Fields

    private String upiID;


    // Constructors
    // ----------------------------------------------

    public UPIStrategy(String upiID) {
        this.upiID = upiID;
    }


    // Methods
    // ----------------------------------------------

    @Override
    public void pay(double amount) {
        System.out.println("Rs " + amount + "/- paid via UPI id :: " + upiID);
    }


}
