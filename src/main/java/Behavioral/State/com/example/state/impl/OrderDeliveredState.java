package Behavioral.State.com.example.state.impl;

import Behavioral.State.com.example.context.OrderContext;
import Behavioral.State.com.example.state.OrderState;


public class OrderDeliveredState implements OrderState {

    // Fields


    // Constructors


    // OrderState Methods
    // ----------------------------------------------

    @Override
    public void next(OrderContext context) {
        System.out.println("Order is already Delievered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel. Order is already delivered.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Returned Order. New Order has been placed.");
        context.setOrderState(new OrderReturnedState());
    }


}
