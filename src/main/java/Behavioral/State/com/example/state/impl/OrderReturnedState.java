package Behavioral.State.com.example.state.impl;

import Behavioral.State.com.example.context.OrderContext;
import Behavioral.State.com.example.state.OrderState;


public class OrderReturnedState implements OrderState {

    // Fields


    // Constructors


    // OrderState Methods
    // ----------------------------------------------

    @Override
    public void next(OrderContext context) {
        System.out.println("Returned order process completed.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Return process cancelled.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Order already returned.");
    }


}
