package Behavioral.Strategy.com.example.payment.strategy;

import Behavioral.Strategy.com.example.payment.Payment;


public class CashStrategy implements Payment {

    // Fields


    // Constructors
    // ----------------------------------------------


    // Methods
    // ----------------------------------------------

    @Override
    public void pay(double amount) {
        System.out.println("Rs " + amount + "/- paid via CASH");
    }

}
