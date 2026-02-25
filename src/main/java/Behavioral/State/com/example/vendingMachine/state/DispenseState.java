package Behavioral.State.com.example.vendingMachine.state;

import Behavioral.State.com.example.vendingMachine.VendingMachineContext;


public class DispenseState implements VendingMachineState {

    // VendingMachineState Methods
    // -------------------------------------------------------

    @Override
    public void insertCoin(VendingMachineContext context, int coin) {
        System.out.println("Please wait. Dispensing product.");
    }

    @Override
    public void selectProduct(VendingMachineContext context, int productCode) {
        int price = context.getProductPrice(productCode);
        int change = context.getTotalAmount() - price;

        System.out.println("Product dispensed for code: " + productCode);

        if (change > 0) {
            System.out.println("Change returned: " + change);
        }

        context.resetAmount();

        // now 'context' -> new AcceptCoinState()
        context.setState(context.getAcceptCoinState());
    }

    @Override
    public void cancel(VendingMachineContext context) {
        System.out.println("Cannot cancel. Product is being dispensed.");
    }

}
