package Behavioral.State.com.example.vendingMachine.state;

import Behavioral.State.com.example.vendingMachine.VendingMachineContext;


public class SelectionState implements VendingMachineState {

    // VendingMachineState Methods
    // -------------------------------------------------------

    @Override
    public void insertCoin(VendingMachineContext context, int coin) {
        System.out.println("Product already selected. Cannot insert more coins.");
    }

    @Override
    public void selectProduct(VendingMachineContext context, int productCode) {

        int productPrice = context.getProductPrice(productCode);

        int amountCollected = context.getTotalAmount();
        if (amountCollected < productPrice) {
            System.out.println("Insufficient funds. Please insert more coins.");

            context.setState(new AcceptCoinState());
            return;
        }

        // now 'context' -> new DispenseState()
        context.setState(context.getDispenseState());

        // calling DispenseState selectProduct()
        context.selectProduct(productCode);
    }

    @Override
    public void cancel(VendingMachineContext context) {
        System.out.println("Aborting the transaction....");

        System.out.println("Money refunded :: " + context.getTotalAmount());
        context.resetAmount();
        context.setState(context.getAcceptCoinState());
    }

}
