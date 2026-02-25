package Behavioral.State.com.example.vendingMachine.state;

import Behavioral.State.com.example.vendingMachine.VendingMachineContext;


public interface VendingMachineState {

    void insertCoin(VendingMachineContext context, int coin);

    void selectProduct(VendingMachineContext context, int productCode);

    void cancel(VendingMachineContext context);
}
