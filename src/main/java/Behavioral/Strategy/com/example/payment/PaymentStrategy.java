package Behavioral.Strategy.com.example.payment;

public class PaymentStrategy {

    // Fields

    private final Payment payment;


    // Constructors
    // ----------------------------------------------

    public PaymentStrategy(final Payment payment) {
        this.payment = payment;
    }


    // Methods
    // ----------------------------------------------

    public boolean processPayment(double amount) {

        this.payment.pay(amount);
        return true;
    }

}
