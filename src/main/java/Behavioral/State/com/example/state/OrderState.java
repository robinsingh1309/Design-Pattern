package Behavioral.State.com.example.state;

import Behavioral.State.com.example.context.OrderContext;


public interface OrderState {

    void next(OrderContext context);

    void cancel(OrderContext context);

    void returnOrder(OrderContext context);

}
