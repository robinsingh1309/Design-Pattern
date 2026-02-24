package Behavioral.State.com.example.context;

import Behavioral.State.com.example.state.OrderState;
import Behavioral.State.com.example.state.impl.OrderPlacedState;


public class OrderContext {

    // Fields

    private OrderState orderState;


    // Constructors
    // ----------------------------------------------

    public OrderContext() {
        this.orderState = new OrderPlacedState(); // Default state
    }


    // Methods
    // ----------------------------------------------

    public void proceedToNext() {
        orderState.next(this);
    }

    public void cancel() {
        orderState.cancel(this);
    }

    public void returnOrder() {
        orderState.returnOrder(this);
    }


    // Setters
    // ----------------------------------------------

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }


}
