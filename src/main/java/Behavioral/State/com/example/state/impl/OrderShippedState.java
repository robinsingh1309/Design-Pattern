package Behavioral.State.com.example.state.impl;

import Behavioral.State.com.example.context.OrderContext;
import Behavioral.State.com.example.state.OrderState;


public class OrderShippedState implements OrderState {

    // Fields


    // Constructors


    // OrderState Methods
    // ----------------------------------------------

    @Override
    public void next(OrderContext context) {
        System.out.println("Order has been shipped. Moving to Delivered state");
        context.setOrderState(new OrderDeliveredState());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order Cancelled.");
        context.setOrderState(new OrderCancelledState());
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Order cannot be returned as it's in Shipped state.");
    }


}
