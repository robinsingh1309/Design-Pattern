package Behavioral.State.com.example.state.impl;

import Behavioral.State.com.example.context.OrderContext;
import Behavioral.State.com.example.state.OrderState;


public class OrderCancelledState implements OrderState {

    // Fields


    // Constructors


    // OrderState Methods
    // ----------------------------------------------

    @Override
    public void next(OrderContext context) {
        System.out.println("Cannot proceed. Order is cancelled.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Order is already cancelled and it cannot be returned.");
    }


}
