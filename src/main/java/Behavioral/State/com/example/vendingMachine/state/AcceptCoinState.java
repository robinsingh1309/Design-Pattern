package Behavioral.State.com.example.vendingMachine.state;

import Behavioral.State.com.example.vendingMachine.VendingMachineContext;


public class AcceptCoinState implements VendingMachineState {

    // VendingMachineState Methods
    // -------------------------------------------------------

    @Override
    public void insertCoin(VendingMachineContext context, int coin) {
        context.addAmount(coin);
        System.out.println("Total coins inserted amount : " + context.getTotalAmount());
    }

    @Override
    public void selectProduct(VendingMachineContext context, int productCode) {
        if (context.getTotalAmount() <= 0) {
            System.out.println("Insert Coins first...");
            return;
        }

        // now 'context' -> new SelectionState()
        context.setState(context.getSelectionState());

        // calling SelectionState selectProduct()
        context.selectProduct(productCode);
    }

    @Override
    public void cancel(VendingMachineContext context) {
        System.out.println("Aborting the transaction....");

        System.out.println("Money refunded :: " + context.getTotalAmount());
        context.resetAmount();
    }


}
