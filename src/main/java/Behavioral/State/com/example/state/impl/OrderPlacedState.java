package Behavioral.State.com.example.state.impl;

import Behavioral.State.com.example.context.OrderContext;
import Behavioral.State.com.example.state.OrderState;


public class OrderPlacedState implements OrderState {

    // Fields


    // Constructors


    // OrderState Methods
    // ----------------------------------------------

    @Override
    public void next(OrderContext context) {
        System.out.println("Order has been placed. Moving to Shipped state");
        context.setOrderState(new OrderShippedState());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order has been cancelled");
        context.setOrderState(new OrderCancelledState());
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Cannot return. Order not delivered yet.");
    }


}
