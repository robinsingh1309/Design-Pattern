package Behavioral.State.com.example.main;

import Behavioral.State.com.example.context.OrderContext;


public class StatePatternDemo {

    public static void main(String[] args) {

        System.out.println("===== TEST 1: Normal Order Flow =====");
        OrderContext order1 = new OrderContext();
        order1.proceedToNext();  // Placed → Shipped
        order1.proceedToNext();  // Shipped → Delivered
        order1.proceedToNext();  // Already Delivered

        System.out.println("\n===== TEST 2: Cancel Before Shipping =====");
        OrderContext order2 = new OrderContext();
        order2.cancel();         // Placed → Cancelled
        order2.proceedToNext();  // Should not proceed

        System.out.println("\n===== TEST 3: Cancel After Shipping =====");
        OrderContext order3 = new OrderContext();
        order3.proceedToNext();  // Placed → Shipped
        order3.cancel();         // Should not allow cancel

        System.out.println("\n===== TEST 4: Return After Delivery =====");
        OrderContext order4 = new OrderContext();
        order4.proceedToNext();  // Placed → Shipped
        order4.proceedToNext();  // Shipped → Delivered
        order4.returnOrder();    // Delivered → Returned
        order4.returnOrder();    // Already Returned

        System.out.println("\n===== TEST 5: Invalid Return Before Delivery =====");
        OrderContext order5 = new OrderContext();
        order5.returnOrder(); 

    }

}
