package Behavioral.Strategy.com.example.payment.strategy;

import Behavioral.Strategy.com.example.payment.Payment;


public class CreditCardStrategy implements Payment {

    // Fields

    private String cardNumber;


    // Constructors
    // ----------------------------------------------

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    // Methods
    // ----------------------------------------------

    @Override
    public void pay(double amount) {
        System.out.println("Rs " + amount + "/- paid via Credit card with number :: " + cardNumber);
    }


}
