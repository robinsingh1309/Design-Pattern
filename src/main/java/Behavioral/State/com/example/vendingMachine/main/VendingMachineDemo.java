package Behavioral.State.com.example.vendingMachine.main;

import Behavioral.State.com.example.vendingMachine.VendingMachineContext;

public class VendingMachineDemo {

    public static void main(String[] args) {
        
        VendingMachineContext machine = new VendingMachineContext();

        machine.addProduct(1, 20); // productCode -> productPrice
        machine.addProduct(2, 30); // productCode -> productPrice

        machine.insertCoin(10);
        machine.insertCoin(15);

        machine.selectProduct(1);
    }

}
