package Behavioral.Strategy.com.example.main;

import Behavioral.Strategy.com.example.payment.PaymentStrategy;
import Behavioral.Strategy.com.example.payment.strategy.CashStrategy;
import Behavioral.Strategy.com.example.payment.strategy.CreditCardStrategy;
import Behavioral.Strategy.com.example.payment.strategy.UPIStrategy;


public class StrategyPatternDemo {

    public static void main(String[] args) {

        /**
         * We use Strategy Pattern when we want Object to have different behaviors and be able to switch
         * from one behavior to other during RUNTIME.
         * 
         * It depends on us during runtime which payment strategy to use
         */

        CreditCardStrategy creditCard = new CreditCardStrategy("1231131245454");
        PaymentStrategy creditCardPay = new PaymentStrategy(creditCard);

        creditCardPay.processPayment(1500);


        UPIStrategy upi = new UPIStrategy("robin@example");
        PaymentStrategy upiPay = new PaymentStrategy(upi);

        upiPay.processPayment(500);


        CashStrategy cash = new CashStrategy();
        PaymentStrategy cashPay = new PaymentStrategy(cash);

        cashPay.processPayment(100);

    }

}
